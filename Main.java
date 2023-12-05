///import java.util.InputMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

  public static void main(String[] args) {

      Scanner in = new Scanner(System.in);
      double length = 0;
      double width = 0;
      int finish_idx;
      JOptionPane error = new JOptionPane();

      // USER - LOGIN
      System.out.println("\n*****************WELCOME TO ZEITH REAL ESTATE*****************");       
      

      // SELECT THE TYPE OF FINISH FOR THE HOUSE
      System.out.println("\n");
      System.out.println("Select  the type of House finish you want: ");
      System.out.println("1.BASIC\n2.STANDARD\n3.ELEGANT\n0.EXIT");
      System.out.println("\n");
      finish_idx = in.nextInt();

      if (finish_idx == 1)
      {
          //initialize BASIC child class
      }
      else if (finish_idx == 2)
      {
        // initialize STANDARD CLASS
        StandardFinished room = new StandardFinished();
        room.FinishPrice();
      }
      else if (finish_idx == 3)
      {
          ElegantRoom room = new ElegantRoom(length, width, finish_idx);

            room.compute_area();
            room.FinishPrice();
            room.setBalconies();
            room.setRoomNumber();
            System.out.println( "Discount: " + room.computeDiscount());
            System.out.println("Total Price: " + room.getTotalPrice());

      }
      else if(finish_idx==0){
        System.exit(0);
      }
      else{
        System.out.println("Invalid choice");
      }
    
       in.close();

      // FIRST OPTION : ROOM DIMENSIONS
       
    // CATCH ERRORS    
      
    }
   
}