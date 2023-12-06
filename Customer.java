import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Customer {
    JOptionPane cust_cred = new JOptionPane();
    Scanner sc = new Scanner(System.in);
    private String firstname;
    private String lastname;
    private int phone;

    public Customer() {
    

    /**public Customer(String firstname, String lastname, int phone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        */
    }

    public void getInfo() {
        try{
            firstname = cust_cred.showInputDialog(cust_cred, "Enter firstname: ", "REGISTER", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(InputMismatchException e)
        {
            cust_cred.showMessageDialog(cust_cred, "Incorrect input", "ERROR IN INPUT", JOptionPane.ERROR_MESSAGE);
            this.getInfo();
        }
        try
        {
        lastname = cust_cred.showInputDialog(cust_cred, "Enter lastname: ", "REGISTER", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(InputMismatchException e)
        {
             cust_cred.showMessageDialog(cust_cred, "Incorrect Input", "ERROR IN INPUT", JOptionPane.ERROR_MESSAGE);
             this.getInfo();
        }
        try {
              String phoneString = cust_cred.showInputDialog(cust_cred, "Enter Phone Number", "REGISTER", JOptionPane.INFORMATION_MESSAGE);
              phone = Integer.parseInt(phoneString);
        } catch (Exception e) {
            // TODO: handle exception
             cust_cred.showMessageDialog(cust_cred, "Incorrect Input", "ERROR IN INPUT", JOptionPane.ERROR_MESSAGE);
              this.getInfo();
        }
        
       
    }

    public void displayDetails() {
        System.out.println("Names: " + firstname + " " + lastname);
        System.out.println("Phone: " + phone);
    }
    public String getFirstName()
    {
        return firstname;
    }
    public String getLastName()
    {
        return lastname;
    }
    public int getPhone()
    {
        return phone;
    }

}