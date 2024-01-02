import java.util.InputMismatchException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class ElegantRoom extends StandardRoom{

    private double additional_charge = 22500;
    
    //constructor for super class
    public ElegantRoom()
    {
        super();
    }

@Override
    public double FinishPrice()
    {
        roomDetails();
        setBedrooms();
        compute_area();
        setBalconies();
        computeDiscount();
        // elegant finish goes for a price of 22 500
       super.base_price += additional_charge;
        //taking care of extra room area charges inclusive extra rooms
        if (compute_area() > 132){
            super.base_price += (compute_area()-132)*7000;
        }
        //taking care of balconies costs
        super.base_price += balcony_cost;
        //taking care of the discount
       // System.out.println("\n After a discount of Ksh." + computeDiscount() +" , The total price for your house is Ksh." + (base_price -= computeDiscount()));
        
        return (super.base_price -= computeDiscount());
    }


}

