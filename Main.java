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
      int finish_idx;
      String finish; 
      JOptionPane error = new JOptionPane();
      double total_cost;


      error.showMessageDialog(error, "WELCOME TO ZENITH REAL ESTATE", "ZENITH REAL ESTATE", JOptionPane.INFORMATION_MESSAGE, logo);
      // USER - LOGIN
<<<<<<< HEAD
      System.out.println("\n*****************WELCOME TO ZEITH REAL ESTATE*****************");       
      

=======
      LogIn user_login = new LogIn();
      user_login.checkPassword();

      //TAKE IN USER INPUT
      Customer buyer = new Customer();
      buyer.getInfo();
     
      
     
      // FIRST OPTION : ROOM DIMENSIONS

        System.out.println("Enter the length and width for each room in your house: ");
        System.out.println("\n");
  
        do{
           System.out.println("\t Length>>: ");
        try{
          length = in.nextDouble();
        }
        catch(InputMismatchException e){
        error.showMessageDialog(error, e, "Input Mismatch Exception", JOptionPane.OK_CANCEL_OPTION, errorIcon);
//in.next();
        }
        System.out.print("\t Width >> ");
        try{
          width = in.nextDouble();
        }
        catch(InputMismatchException e){
        error.showMessageDialog(error, e, "Input Mismatch Exception", JOptionPane.OK_CANCEL_OPTION, errorIcon);
        //in.next();
        }
        System.out.println("\n");
        if(length < width){
         error.showMessageDialog(error, "Length cannot be greater than width.", "Input error", JOptionPane.ERROR_MESSAGE, errorIcon);
        }
        }while(length < 12 || width < 11);
      
    // CATCH ERRORS   
      
      
>>>>>>> origin
      // SELECT THE TYPE OF FINISH FOR THE HOUSE
      System.out.println("\n");
      System.out.println("Select  the type of House finish: (1,2,3,0) ");
      System.out.println("1.BASIC\n2.STANDARD\n3.ELEGANT\n0.EXIT");
      System.out.println("\n");
      finish_idx = in.nextInt();

      if (finish_idx == 1)
      {
          //initialize BASIC child class
      }
      else if (finish_idx == 2)
      {
        finish = "Standard";
        // initialize STANDARD CLASS
<<<<<<< HEAD
        StandardFinished room = new StandardFinished();
        room.FinishPrice();
=======
        StandardFinished user_room = new StandardFinished(length, width, finish_idx);
        //room.roomDetails();
        user_room.compute_area();
        user_room.computeDiscount();
        user_room.setBalconies();
        user_room.FinishPrice();
       
>>>>>>> origin
      }
      else if (finish_idx == 3)
      {
        finish = "Elegant";
          ElegantRoom room = new ElegantRoom(length, width, finish_idx);

            room.compute_area();
            room.FinishPrice();
            room.setBalconies();
            room.setRoomNumber();
          
          


      }
      else if(finish_idx==0){
        System.exit(0);
      }
      else{
       error.showMessageDialog(error, "Invalid Input", "Input Error", JOptionPane.ERROR_MESSAGE);
      }    
       in.close();

      // FIRST OPTION : ROOM DIMENSIONS
       
    // CATCH ERRORS    
      
    }
   
}