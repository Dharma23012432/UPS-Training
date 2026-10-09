import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter Celsius: ");
                double c = sc.nextDouble();

                double f = (c * 9 / 5) + 32;

                System.out.println("Fahrenheit = " + f);
                break;

            case 2:
                System.out.print("Enter Fahrenheit: ");
                double fahr = sc.nextDouble();

                double cel = (fahr - 32) * 5 / 9;

                System.out.println("Celsius = " + cel);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}