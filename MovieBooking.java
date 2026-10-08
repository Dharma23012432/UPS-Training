import java.util.Scanner;

class A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Movie Booking System ");
        System.out.println("1. Doomsday");
        System.out.println("2. Dune III");
        System.out.println("3. Clayface");
        System.out.println("4. Master");
        System.out.println("5. Kaithi");
        System.out.print("Choose a movie (1-5): ");
        int movieChoice = input.nextInt();

        System.out.println("\nSelect Screen");
        System.out.println("1. 4K Screen");
        System.out.println("2. IMAX Screen");
        System.out.print("Enter screen (1 or 2): ");
        int screen = input.nextInt();

        System.out.println("\nSeat Type");
        System.out.println("1. Lower - Rs.100");
        System.out.println("2. Upper - Rs.200");
        System.out.print("Choose seat (1 or 2): ");
        int seat = input.nextInt();

        System.out.print("\nEnter number of tickets: ");
        int tickets = input.nextInt();

        String movie = "";
        int price = 0;

        switch (movieChoice) {
            case 1:
                movie = "Doomsday";
                break;
            case 2:
                movie = "Dune III";
                break;
            case 3:
                movie = "Clayface";
                break;
            case 4:
                movie = "Master";
                break;
            case 5:
                movie = "Kaithi";
                break;
            default:
                movie = "Invalid Movie";
        }

        if (seat == 1)
            price = 100;
        else if (seat == 2)
            price = 200;
        else
            System.out.println("Invalid Seat Selection");

        int total = price * tickets;

        System.out.println("\n BOOKING DETAILS ");
        System.out.println("Movie      : " + movie);

        if (screen == 1)
            System.out.println("Screen     : 4K");
        else if (screen == 2)
            System.out.println("Screen     : IMAX");
        else
            System.out.println("Screen     : Invalid");

        if (seat == 1)
            System.out.println("Seat Type  : Lower");
        else
            System.out.println("Seat Type  : Upper");

        System.out.println("Tickets    : " + tickets);
        System.out.println("Total Bill : Rs." + total);
        System.out.println("Booking Successful!");

        input.close();
    }
}
