import java.util.*;

class Movies {
  int totalSeats = 10;

  synchronized void bookTicket(int Seat) {
    System.out.println("Booking Ticket for Seat: " + Seat);
    if (totalSeats >= Seat) {
      System.out.println("Ticket Booked");
      totalSeats = totalSeats - Seat;
      System.out.println("Total Seats Available: " + totalSeats);
    } else {
      System.out.println("Sorry," + Seat + " Seats are Not Available");
      System.out.println("Total Seats Available: " + totalSeats);
    }
  }
}

public class SyncThreads extends Thread {
  int Seat;
  static Movies m;

  public void run() {
    m.bookTicket(Seat);
  }

  public static void main(String[] args) {
    m = new Movies();
    Scanner seat = new Scanner(System.in);
    System.out.println("Enter the number of seats you want to book");
    int seats = seat.nextInt();
    SyncThreads s = new SyncThreads();
    SyncThreads s2 = new SyncThreads();
    s.Seat = seats;
    s.start();
    s2.Seat = seats;
    s2.start();
  }
}
