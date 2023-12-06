///import java.util.InputMismatchException;
import java.awt.Image;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//import ZenithRealEstate.InvoiceGenerate;
public class Main {

  public static void main(String[] args) {
    ImageIcon success = new ImageIcon("C:\\Users\\MJ\\Downloads\\check.png");
    ImageIcon errorIcon = new ImageIcon("C:\\Users\\MJ\\Downloads\\cross.png");
    ImageIcon logo = new ImageIcon("C:\\Users\\MJ\\Downloads\\house.png");
      Scanner in = new Scanner(System.in); 
      double length = 0;
      double width = 0;
      String[] finish_type = {"Basic(Sh 0)", "Standard(Sh.15000)", "Elegant(Shs.22500)", "exit"}; 
      int finish_idx;
      String finish; 
      JOptionPane error = new JOptionPane();
      double finishprice = 0;
      double total_cost; 
     

      error.showMessageDialog(error, "WELCOME TO ZENITH REAL ESTATE", "ZENITH REAL ESTATE", JOptionPane.INFORMATION_MESSAGE, logo);
      // USER - LOGIN
      LogIn user_login = new LogIn();
      user_login.checkPassword();

      //TAKE IN CUSTOMER CREDENTIALS
      Customer buyer = new Customer();
      buyer.getInfo();
      GenerateInvoice invoice = new GenerateInvoice(buyer.getFirstName(), buyer.getLastName(), buyer.getPhone());

       
     
  
      // SELECT THE TYPE OF FINISH FOR THE HOUSE
      //System.out.println("\n");
      finish_idx =  error.showOptionDialog(error, "Select the type of finish: ", "TYPE OF ROOM FINISH", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, finish_type, finish_type[0]);  
      

      if (finish_idx == 0)
      {
        finish = "Basic";
         BasicFinished room = new BasicFinished();
        total_cost = room.FinishPrice();
         invoice.printReceipt(room.getLength(), room.getWidth(), room.getArea(), finish, finishprice, room.getBedrooms(), room.getBalconies(), total_cost, room.computeDiscount());
      }
      else if (finish_idx == 1)
      {
        finish = "Standard";
        finishprice = 15000;
        // initialize STANDARD CLASS
        StandardFinished room = new StandardFinished();
        //room.roomDetails();
        total_cost = room.FinishPrice();
        invoice.printReceipt(room.getLength(), room.getWidth(), room.getArea(), finish, finishprice, room.getBedrooms(), room.getBalconies(), total_cost, room.computeDiscount());
       
      }
      else if (finish_idx == 2)
      {
        finish = "Elegant";
          ElegantRoom room = new ElegantRoom();
          total_cost =  room.FinishPrice();
          finishprice = 15000;
          invoice.printReceipt(room.getLength(), room.getWidth(), room.getArea(), finish, finishprice, room.getBedrooms(), room.getBalconies(), total_cost, room.computeDiscount());


      }
      else if(finish_idx==3){
        System.exit(0);
      }
      else{
       error.showMessageDialog(error, "Invalid Input", "Input Error", JOptionPane.ERROR_MESSAGE);
      }    
  
    }   
}