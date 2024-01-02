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
    System.out.println("\n===========================================ZENITH REAL ESTATE=============================================\n");
    System.out.println("\t\t\tRoom Width:\t\t" + w);
    System.out.println("\t\t\tRoom Length:\t\t" + l);
    System.out.println("\t\t\tRoom Area:\t\t" + area );
    System.out.println("\t\t\tType of Finish:\t\t " + finish);
    System.out.println("\t\t\tFinish Price:\t\t" + finishPrice);
    System.out.println("\t\t\tBalconies:\t\t" + balconies );
    System.out.println("\t\t\tRoom Number:\t\t " + room_no );
    System.out.println("************************************************************************************************************");
    System.out.println("\t\t\t\tTotal Price:\t\t " + totalPrice);
    System.out.println("\t\t\t\tDiscount:\t\t " + discount);
    System.out.println("\n===========================================================================================================\n");
    System.out.println("\t\t\t\tCustomer Name:\t\t " + cust_firstname + " " +cust_lastname);
    System.out.println("\t\t\t\tPhone Number:\t\t0" + phone );
    System.out.println("\t\t\t\n******ZENITH REAL ESTATE******\n\t\t\tHONORED TO SERVE YOU********\n\n");
}
}
