import java.util.Scanner;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed!");
            return Double.NaN;
        }
        return (double) a / b;
    }
}

class UserInterface {
    Scanner sc = new Scanner(System.in);
    Calculator calc = new Calculator();

    public void performAddition() {
        System.out.println("Choose addition type:");
        System.out.println("1. Two Integers");
        System.out.println("2. Two Doubles");
        System.out.println("3. Three Integers");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter two integers: ");
                int a1 = sc.nextInt();
                int b1 = sc.nextInt();
                System.out.println("Result = " + calc.add(a1, b1));
                break;
            case 2:
                System.out.print("Enter two double values: ");
                double a2 = sc.nextDouble();
                double b2 = sc.nextDouble();
                System.out.println("Result = " + calc.add(a2, b2));
                break;
            case 3:
                System.out.print("Enter three integers: ");
                int a3 = sc.nextInt();
                int b3 = sc.nextInt();
                int c3 = sc.nextInt();
                System.out.println("Result = " + calc.add(a3, b3, c3));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    public void performSubtraction() {
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Result = " + calc.subtract(a, b));
    }

    public void performMultiplication() {
        System.out.print("Enter two double values: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Result = " + calc.multiply(a, b));
    }

    public void performDivision() {
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        double result = calc.divide(a, b);
        if (!Double.isNaN(result))
            System.out.println("Result = " + result);
    }

    public void mainMenu() {
        int choice;
        do {
            System.out.println("\n--- Calculator Application ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    performAddition();
                    break;
                case 2:
                    performSubtraction();
                    break;
                case 3:
                    performMultiplication();
                    break;
                case 4:
                    performDivision();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);
    }
}

public class CalculatorApplication {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.mainMenu();
    }
}
