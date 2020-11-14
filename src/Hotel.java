import java.util.*;
public class Hotel {

    //int hotelId;
    private String hotelName;
    private String address;
    private String city;
    private String landmark;

    private int NumberofRooms;
    //private float rating;
    Facility facilities;

    Scanner sc=new Scanner(System.in);

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public int getNumberofRooms() {
        return NumberofRooms;
    }

    public void setNumberofRooms(int numberofRooms) {
        NumberofRooms = numberofRooms;
    }

//    public Facilities getFacilities() {
//        return facilities;
//    }
//
//    public void setFacilities(Facilities facilities) {
//        this.facilities = facilities;
//    }



//    public Hotel() {
//        System.out.println("enter hotel details");
//        hotelId =sc.nextInt();
//        hotelname =sc.next();
//        adress = sc.next();
//        rooms = sc.nextInt();
//        rating = sc.nextFloat();
//       // facilities = sc.next();
//    }
}
