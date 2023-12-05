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
    ImageIcon success = new ImageIcon("./check.png");
    ImageIcon errorIcon = new ImageIcon("./cross.png");
    ImageIcon logo = new ImageIcon("./house.png");
      Scanner in = new Scanner(System.in); 
      double length = 0;
      double width = 0;
      String[] finish_type = {"Basic(0)", "Standard(Sh.15000)", "Elegant(Shs.22500)", "exit"}; 
      int finish_idx;
      String finish; 
      JOptionPane error = new JOptionPane();
      double total_cost;


      error.showMessageDialog(error, "WELCOME TO ZENITH REAL ESTATE", "ZENITH REAL ESTATE", JOptionPane.INFORMATION_MESSAGE, logo);
      // USER - LOGIN
      LogIn user_login = new LogIn();
      user_login.checkPassword();

      //TAKE IN USER INPUT
      Customer buyer = new Customer();
      buyer.getInfo();
     
      
     
      // FIRST OPTION : ROOM DIMENSIONS

       error.showInputDialog(error, "Enter the Room Dimensions", "ZENITH REAL ESTATE", JOptionPane.PLAIN_MESSAGE);
        System.out.println("\n");
  
        do{
          String lengthString =  error.showInputDialog(error, "Enter the length of the room", "ROOM DIMENSIONS", JOptionPane.PLAIN_MESSAGE);
        try{
          length = Double.parseDouble(lengthString);
        }
        catch(InputMismatchException e){
        error.showMessageDialog(error, e, "Input Mismatch Exception", JOptionPane.OK_CANCEL_OPTION, errorIcon);
//in.next();
        }
        String widthString = error.showInputDialog(error, "Enter the Width: ", "ROOM DIMENSIONS", JOptionPane.ERROR_MESSAGE);
        try{
          width = Double.parseDouble(widthString);
        }
        catch(InputMismatchException e){
        error.showMessageDialog(error, e, "Input Mismatch Exception", JOptionPane.OK_CANCEL_OPTION, errorIcon);
        //in.next();
        }
        System.out.println("\n");
        if(length < width){
         error.showMessageDialog(error, "Length cannot be greater than width.", "Input error", JOptionPane.ERROR_MESSAGE);
        }
        }while(length < 12 || width < 11);
      
    // CATCH ERRORS   
      
      
      // SELECT THE TYPE OF FINISH FOR THE HOUSE
      System.out.println("\n");
      finish_idx =  error.showOptionDialog(error, "Select the type of finish: ", "TYPE OF ROOM FINISH", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, finish_type, finish_type[0]);  
      

      if (finish_idx == 0)
      {
          //initialize BASIC child class
      }
      else if (finish_idx == 1)
      {
        finish = "Standard";
        // initialize STANDARD CLASS
        StandardFinished user_room = new StandardFinished(length, width, finish_idx);
        //room.roomDetails();
        user_room.compute_area();
        user_room.computeDiscount();
        user_room.setBalconies();
        user_room.FinishPrice();
       
      }
      else if (finish_idx == 2)
      {
        finish = "Elegant";
          ElegantRoom room = new ElegantRoom(length, width, finish_idx);

            room.compute_area();
            room.FinishPrice();
            room.setBalconies();
            room.setRoomNumber();
          
          


      }
      else if(finish_idx==3){
        System.exit(0);
      }
      else{
       error.showMessageDialog(error, "Invalid Input", "Input Error", JOptionPane.ERROR_MESSAGE);
      }    
       in.close();
    }
   
}