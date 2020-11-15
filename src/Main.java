import javax.swing.*;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


       // System.out.println("Enter Your Choice: ");
       // int choice = scanner.nextInt();
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.print("\nEnter your Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    bookHotel();
                    break;
                case 2:
                    System.out.println("Updating...");
                    break;
                case 3:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To Print the Choice Options.");
        System.out.println("\t 1 - To Book a Hotel.");
        System.out.println("\t 2 - To Cancel a Booking");
        System.out.println("\t 3 - To Quit the Application.");
    }
    public static void bookHotel() {

        User userObject = new User();

        System.out.println("\t***********USER DETAILS*************");

        System.out.print("Enter the User ID: ");
        int userID = scanner.nextInt();
        scanner.nextLine();
        userObject.setUserId(userID);

        System.out.print("Enter the User Name: ");
        String userName = scanner.nextLine();
        userObject.setName(userName);

        System.out.print("Enter the Mobile Number: ");
        String userMobile = scanner.nextLine();
        userObject.setMobileNumber(userMobile);

        System.out.print("Enter your Gender: ");
        String userGender = scanner.nextLine();
        userObject.setGender(userGender);

        userObject.userDetails();

        Hotel hotelObject = new Hotel();

        System.out.print("\nEnter the City where you want to book: ");
        String getCity = scanner.nextLine();
       // scanner.nextLine();
        hotelObject.setCity(getCity);
        System.out.println(getCity);

        System.out.print("Enter the Number of Rooms you want to Book: ");
        int roomNumber = scanner.nextInt();
       // scanner.nextLine();
        hotelObject.setNumberRooms(roomNumber);

        hotelObject.displayDate();
        Connection c = null;
        try {
            c = PostgresManager.getConnection();
            c = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres","postgres","16131a05g1");
            Statement statement = c.createStatement();
            String queryCheck="select hotelname from hotel"+" where city=?";
            PreparedStatement ps=c.prepareStatement(queryCheck);
            ps.setString(1,getCity);
            ResultSet resultSet=ps.executeQuery();


            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }





    }





//
//
//        System.out.print("Enter the User ID: ");
//        int userID = scanner.nextInt();
//        scanner.nextLine();
//        userObject.setUserId(userID);



//        Address ad=new Address();
//
//        Duration d=new Duration();
//        Booking bk=new Booking();
//        PaymentStatus ps=PaymentStatus.PAID;
//        PaymentStatus pk=PaymentStatus.UNPAID;
//         System.out.println(s.userId+s.gender+s.mobno+s.name);
//        System.out.println(ad.pincode+ad.city+ad.state+ad.landmark);
//        System.out.println(h.adress+h.hotelname+h.facilities+h.hotelId+h.rating+h.rooms);
//        System.out.println(d.Days);
//        System.out.println(bk.bookingId + bk.hotelId + bk.userId + bk.amount + bk.amount+ps.toString());
//        System.out.println(ps);
}





