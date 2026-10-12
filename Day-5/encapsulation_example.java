import java.util.Scanner;

class ATM {

    private double bal = 0;

    public void deposit(double amt) {
        bal += amt;
        System.out.println("Amount Deposited: " + amt);
    }

    public void withdraw(double amt) {
        if (amt <= bal) {
            bal -= amt;
            System.out.println("Amount Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + bal);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();

        int choice = 0;

        while (choice != 4) {

            System.out.println("\n ATM Menu ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmt = sc.nextDouble();
                    atm.deposit(depositAmt);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;

                case 3:
                    atm.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }

    }
}