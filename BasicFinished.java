
public class BasicFinished extends StandardRoom{
    
    //private double total_cost=0;
    
    BasicFinished(){
        super();
    }
    @Override
    public double FinishPrice() {
        roomDetails();
        setBedrooms();
        compute_area();
        setBalconies();
        computeDiscount();

        if (compute_area() > 132){
            super.base_price += (compute_area()-132) * 7000;  
        }
        
      super.base_price += balcony_cost;
        

       // System.out.println("\n After a discount of Ksh." + computeDiscount() +" , The total price for your house is Ksh." + (base_price -= computeDiscount()));
        
        return (super.base_price - computeDiscount());
    }

}