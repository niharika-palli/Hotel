import java.util.Scanner;

public class Booking extends Hotel {

    Scanner scanner = new Scanner(System.in);

    //private final int Duration;
    int bookingId;
    int userId;
    int hotelId;
    //List<Rooms> bookedRooms;
    int amount;
    private PaymentStatus status_of_payment;
    //Date bookingTime;
    int days;


//    public Booking() {
//        System.out.println("booking details");
//        bookingId = sc.nextInt();
//        userId = sc.nextInt();
//        hotelId =sc.nextInt();
//        amount = sc.nextInt();
//       setStatus_of_payment(PaymentStatus.valueOf(sc.next()));
//        Duration = sc.nextInt();
//
//    }

   public PaymentStatus getStatus_of_payment() {
        return status_of_payment;
    }

    public void setStatus_of_payment(PaymentStatus status_of_payment) {
        this.status_of_payment = status_of_payment;
    }

}
