import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double length;
        double width;
        int finish_idx;
          JOptionPane error = new JOptionPane();
        // USER - LOGIN 
        System.out.println("WELCOME TO ZEITH REAL ESTATE");       

        // FIRST OPTION : ROOM DIMENSIONS
        System.out.println("Enter the length and width for each room in your house: ");
        System.out.print("Lenght >> ");
        length = in.nextDouble();
         System.out.print("Width >> ");
        width = in.nextDouble();
         // CATCH ERRORS   
       
        
        // SELECT THE TYPE OF FINISH FOR THE HOUSE
        System.out.println("Enter the type of finish: ");
        System.out.println("0. BASIC\n1.STANDARD\n2.ELEGANT");
        finish_idx = in.nextInt();

        if (finish_idx == 0)
        {
            //initialize BASIC child class
        }
        else if (finish_idx == 1)
        {
          // initialize STANDARD CLASS
        }
        else if (finish_idx == 2)
        {
            ElegantRoom room = new ElegantRoom(length, width, finish_idx);
             room.compute_area();
             room.FinishPrice();
             room.setBalconies();
             room.setRoomNumber();
             System.out.println( "Discount: " + room.computeDiscount());
             System.out.println("Total Price: " + room.getTotalPrice());

        }

    
       
    }
   
}