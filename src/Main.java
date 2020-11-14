import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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

//        Hotel hotelObject = new Hotel();
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
    }


