import java.util.*;

public class Hotel extends Duration {

//    private static Scanner scanner = new Scanner(System.in);

    //int hotelId;
    private String hotelName;
//    private String address;
    private String city;
    private String landmark;

    private int numberRooms;


    //private float rating;
    Facility facilities;



//    public String getHotelName() {
//        return hotelName;
//    }
//
//    public void setHotelName(String hotelName) {
//        this.hotelName = hotelName;
//    }

//    public String getAddress() {

//    public int getNumberRooms() {
//        return numberRooms;
//    }

    public void setNumberRooms(int numberRooms) {
        this.numberRooms = numberRooms;
    }
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }

//    public String getCity() {
//        return city;
//    }

    public void setCity(String city) {
        this.city = city;
    }

//    public String getLandmark() {
//        return landmark;
//    }
//
//    public void setLandmark(String landmark) {
//        this.landmark = landmark;
//    }

    public void displayDate() {
        super.getDate();

    }




//    public Facilities getFacilities() {
//        return facilities;
//    }
//
//    public void setFacilities(Facilities facilities) {
//        this.facilities = facilities;
//    }

}
