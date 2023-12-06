
public class StandardFinished extends StandardRoom{

    private double additional_charge =15000.00;
    private double total_cost= super.base_price;
    //constructor
    StandardFinished(){
        super();
    }
    // to be retained
    @Override
    public double FinishPrice() {
        roomDetails();
        setBedrooms();
        compute_area();
        setBalconies();
        computeDiscount();
        base_price+=additional_charge;
        //taking care of extra room area charges inclusive extra rooms
        if (compute_area()>132){
            total_cost += (compute_area()-132)*7000;
        }
        //taking care of balconies costs
        total_cost += balcony_cost;
        //taking care of the discount
        //System.out.println("\n After a discount of Ksh." + computeDiscount() +" , The total price for your house is Ksh." + (base_price -= computeDiscount()));
      
        return (total_cost - computeDiscount());    
    }

}
