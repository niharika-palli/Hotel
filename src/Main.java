import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User s = new User();
        Address ad=new Address();
        Hotel h=new Hotel();
        Duration d=new Duration();
        Booking bk=new Booking();
        PaymentStatus ps=PaymentStatus.PAID;
        PaymentStatus pk=PaymentStatus.UNPAID;
        System.out.println(s.userId+s.gender+s.mobno+s.name);
        System.out.println(ad.pincode+ad.city+ad.state+ad.landmark);
        System.out.println(h.adress+h.hotelname+h.facilities+h.hotelId+h.rating+h.rooms);
        System.out.println(d.Days);
        System.out.println(bk.bookingId + bk.hotelId + bk.userId + bk.amount + bk.amount+ps.toString());
        System.out.println(ps);
        }
    }


