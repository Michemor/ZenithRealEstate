
public class BasicFinished extends StandardRoom{
    double total_cost = super.base_price;
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
            total_cost += (compute_area()-132) * 7000;  
        }
        
      total_cost += balcony_cost;
        
      
        System.out.println("\n After a discount of Ksh." + computeDiscount() +" , The total price for your house is Ksh." + (base_price -= computeDiscount()));
        
        return (total_cost -= computeDiscount());
    }

}