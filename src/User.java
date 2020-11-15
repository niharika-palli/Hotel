import java.util.Scanner;

public class User {
    private int userId;
    private String userName;
    private String mobileNumber;
    private String gender;

    private static Scanner sc = new Scanner(System.in);

//    public User() {
//        userId = sc.nextInt();
//        userName = sc.next();
//        mobileNumber = sc.next();
//        gender = sc.next();
//    }

//    public int getUserId() {
//        return userId;
//
//    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

//    public String getName() {
//        return userName;
//    }

    public void setName(String userName) {
        this.userName = userName;
    }

//    public String getMobileNumber() {
//        return mobileNumber;
//    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

//    public String getGender() {
//        System.out.print("Enter Your Gender: ");
//        return gender;
//    }

    public void setGender(String gender) {
        this.gender = gender.toUpperCase();
    }
    public void userDetails() {
        System.out.println("\nYOUR USER DETAILS ARE:");
        System.out.println("\n\tUser ID: " + userId + "\n\tUser Name: " + userName + "\n\tMobile Number: " + mobileNumber + "\n\tGender: " + gender);
    }
}
