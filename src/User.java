import java.util.Scanner;

public class User {
    int userId;
    String name;
    String mobno;
    String gender;

    public User() {
         userId=sc.nextInt();
        name =sc.next() ;
        mobno = sc.next();
        gender =sc.next();
    }
Scanner sc=new Scanner(System.in);
   /* public int getUserId() {
        System.out.println("enter the id");
        userId=sc.nextInt();
        return userId;
    }

    public void setUserId(int userId) {
       // userId=sc.nextInt();
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }*/
}
