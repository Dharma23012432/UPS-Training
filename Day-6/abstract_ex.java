import java.util.*;

abstract class RBI {
    void display() {
        System.out.print("RBI Bank");
    }
}

class SBI extends RBI {
    @Override
    void display() {
        System.out.print("SBI Bank");
    }
}

class IndianBank extends RBI {
    @Override
    void display() {
        System.out.print("Indian Bank");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        RBI rbi = null;
        System.out.println("Enter Choice");

        switch (choice) {
            case 1:
                rbi = new SBI();
                break;

            case 2:
                rbi = new IndianBank();
                break;

            default:
                System.out.print("Invalid Choice");
                return;
        }

        rbi.display();
    }
}