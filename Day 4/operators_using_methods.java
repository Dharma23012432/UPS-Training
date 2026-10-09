import java.util.Scanner;

public class Main {

    static void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    static void sub(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }

    static void mul(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }

    static void div(int a, int b) {
        if (b != 0)
            System.out.println("Division = " + (a / b));
        else
            System.out.println("Cannot divide by zero");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int choice = 0;

        while (choice != 5) {

            System.out.println("\nChoose Operation");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    add(num1, num2);
                    break;

                case 2:
                    sub(num1, num2);
                    break;

                case 3:
                    mul(num1, num2);
                    break;

                case 4:
                    div(num1, num2);
                    break;

                case 5:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }

    }
}