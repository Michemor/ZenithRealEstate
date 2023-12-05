import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class GenerateInvoice{
    private String cust_firstname;
    private String cust_lastname;
    private int phone;
    JOptionPane input = new JOptionPane();

    GenerateInvoice(String firstname, String lastname, int phone)
    {
        this.cust_firstname = firstname;
        this.cust_lastname = lastname;
        this.phone = phone;
    }
     public void printReceipt(double l, double w, double area, String finish, double finishPrice, int room_no, int balconies, double totalPrice, double discount)
   { 
    System.out.println("\n====RECEIPT=====\n");
    System.out.println("\nRoom Width:\t\t" + w);
    System.out.println("Room Length:\t\t" + l);
    System.out.println( "\nRoom Area: \t\t" + area );
    System.out.println( "\nType of Finish:\t\t " + finish);
    System.out.println("\nFinish Price:\t\t" + finishPrice);
    System.out.println("\nBalconies: \t\t" + balconies );
    System.out.println("\nRoom Number:\t\t " + room_no );
    System.out.println("\nTotal Price\t\t " + totalPrice);
    System.out.println("\nDiscount: \t\t " + discount);
    System.out.println("\n==================================\n");
    System.out.println("\nCustomer Name:\t\t " + cust_firstname + " " +cust_lastname);
    System.out.println("Phone Number: \t\t" + phone );
    System.out.println("\n******ZENITH REAL ESTATE\nHONORED TO SERVE YOU********");
}
}
