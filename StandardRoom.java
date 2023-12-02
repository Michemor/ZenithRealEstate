import java.util.*;
abstract public class StandardRoom {
    Scanner in = new Scanner(System.in);
    double room_length;
    double room_width;
     double base_price = 850000;
    double base_area = 132;
  
    
    //private double finishPrice;

    public StandardRoom(double length, double width, int i)
    {
        this.room_length = length;
        this.room_width = width;
       
    }

    abstract public double compute_area();
    abstract public double FinishPrice();
    abstract public int setBalconies();
    abstract public double computeDiscount();
  

}
