
public class StandardFinished extends StandardRoom{

    private double additional_charge =15000.00;
   
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
        base_price += additional_charge;
        //taking care of extra room area charges inclusive extra rooms
        if (compute_area()>132){
            base_price += (compute_area()-132)*7000;
        }
        //taking care of balconies costs
        base_price += balcony_cost;
        //taking care of the discount      
        return (base_price -= computeDiscount());    
    }

}
