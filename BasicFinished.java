
public class BasicFinished extends StandardRoom{
    private double total_cost;
    
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
        if (compute_area()>132){
            base_price += (compute_area()-132)*7000;
            System.out.println("total cost = Ksh." + base_price);
        }
        
        base_price+=balcony_cost;
        
        System.out.println("\n After a discount of Ksh." + computeDiscount() +" , The total price for your house is Ksh." + (base_price*=(1-discount)));
        base_price = total_cost;
        return total_cost;
    }

}