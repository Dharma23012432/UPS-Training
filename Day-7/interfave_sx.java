import java.util.Scanner;

interface Payment {
    void pay(double amt);
}

class UPI implements Payment {

    public void pay(double amt) {
        System.out.println("Payment " +amt + " made using UPI.");
    }
}

class Cash implements Payment {

    public void pay(double amt) {
        System.out.println("Payment " + amt + " made using Cash.");
    }
}

class CreditCard implements Payment {

    public void pay(double amt) {
        System.out.println("Payment " + amt + " made using Credit Card.");
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amount: ");
        double amt = sc.nextDouble();

        System.out.println("\nSelect Payment Method");
        System.out.println("1. UPI");
        System.out.println("2. Cash");
        System.out.println("3. Credit Card");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        Payment payment;

        switch (choice) {
            case 1:
                payment = new UPI();
                payment.pay(amt);
                break;

            case 2:
                payment = new Cash();
                payment.pay(amt);
                break;

            case 3:
                payment = new CreditCard();
                payment.pay(amt);
                break;

            default:
                System.out.println("Invalid Choice");
        }

    }
}