import java.util.Scanner;

public class Address {
    String city;
    String pincode;
    String state;
    String landmark;
Scanner sc=new Scanner(System.in);
    public Address() {
        System.out.println("enter address details");
        city =sc.next();
        pincode = sc.next();
        state = sc.next();
        landmark = sc.next();
    }
}
