import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Reservation {
    private String userName;
    private int seatNumber;

    public Reservation(String userName, int seatNumber) {
        this.userName = userName;
        this.seatNumber = seatNumber;
    }

    public String getUserName() {
        return userName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}

class ReservationSystem {
    private List<Reservation> reservations;

    public ReservationSystem() {
        reservations = new ArrayList<>();
    }

    public void makeReservation(String userName, int seatNumber) {
        Reservation reservation = new Reservation(userName, seatNumber);
        reservations.add(reservation);
        System.out.println("Reservation successful for " + userName + " at seat " + seatNumber);
    }

    public void displayReservations() {
        System.out.println("Current Reservations:");
        for (Reservation reservation : reservations) {
            System.out.println("User: " + reservation.getUserName() + ", Seat: " + reservation.getSeatNumber());
        }
    }
}

 class reservation {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Make Reservation\n2. Display Reservations\n3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter your name:");
                    String userName = scanner.next();
                    System.out.println("Enter seat number:");
                    int seatNumber = scanner.nextInt();
                    reservationSystem.makeReservation(userName, seatNumber);
                    break;
                case 2:
                    reservationSystem.displayReservations();
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}