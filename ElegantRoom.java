import java.util.InputMismatchException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class ElegantRoom extends StandardRoom{
    
    private double user_area;
    private double finishPrice = 22500;
    private double discount = 1;
    private int  finish_idx;
    private int balcony_number;
    private int room_no;
    //constructor for super class
    public ElegantRoom(double l, double w, int i)
    {
        super(l, w, i);
        this.finish_idx = i;
    }
// computes the area of a room
@Override
    public double compute_area()
    {
        user_area = super.room_length * super.room_width;
        double extra_area = user_area - super.base_area;
        if (extra_area > 0)
        {
            super.base_price += extra_area * 7000;
        }
        return user_area;
    }
//adds finish price to total_cost
@Override
    public double FinishPrice()
    {
        // elegant finish goes for a price of 22 500
        super.base_price += finishPrice;
        return (finishPrice);
    }
// takes input from user of the number of balconies and computes price
@Override
    public int setBalconies()
    {
        try 
        {
             System.out.println("Enter the number of balconies: ");
        balcony_number = in.nextInt();
        }
        catch (InputMismatchException err){
            System.out.println(err);
        }
        if (balcony_number == 0)
        {
            super.base_price += 0;
        }
        else if (balcony_number == 1)
        {
            super.base_price += 30000;
        }
        else if (balcony_number > 1)
        {
            int extra_balcony = balcony_number - 1;
            super.base_price += 30000 + (extra_balcony * 27500);
        }

        return balcony_number;
    }
    // takes input of room number and computes price 
    public int setRoomNumber()
    {

        try
        {
              System.out.println("Enter the number of rooms");
        room_no = in.nextInt();
        }
         catch (InputMismatchException e) {
           System.out.println(e);
        System.out.println("Renter room number: ");
           room_no = in.nextInt();
        };
    
        super.base_price *= room_no;
        return (room_no);
       
    }

    // METHOD : COMPUTES DISCOUNT ON TOTAL PRICE
    @Override
     public double computeDiscount()
        {
           if (room_no > 1)
           {
            discount = super.base_price * 0.20;
            super.base_price -= discount;
           }
           return discount;
        }
    public double getTotalPrice()
    {
        return super.base_price;
    }
}

