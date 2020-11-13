import java.util.*;
public class Hotel {
    int hotelId;
    String hotelname;
    String adress;

    int rooms;
    float rating;
    Facilities facilities;
    Scanner sc=new Scanner(System.in);

    public Hotel() {
        System.out.println("enter hotel details");
        hotelId =sc.nextInt();
        hotelname =sc.next();
        adress = sc.next();
        rooms = sc.nextInt();
        rating = sc.nextFloat();
       // facilities = sc.next();
    }
}
