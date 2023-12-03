import java.util.NoSuchElementException;
import java.util.Scanner;

public class Customer {
    Scanner sc = new Scanner(System.in);
    private String firstname;
    private String lastname;
    private int phone;

    public Customer() {
    }

    /**public Customer(String firstname, String lastname, int phone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
    }
    */

    public void getInfo() {
        System.out.println("Enter customers first name:");
        firstname = sc.next();
        System.out.println("Enter customers last name: ");
        lastname = sc.next();
        System.out.println("Enter phone number");
        phone = sc.nextInt();
        sc.close();
    }

    public void displayDetails() {
        System.out.println("Names: " + firstname + " " + lastname);
        System.out.println("Phone: +254" + phone);
    }
}