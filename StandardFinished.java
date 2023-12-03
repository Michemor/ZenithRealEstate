import java.util.InputMismatchException;

public class StandardFinished extends StandardRoom{

    private double room_area;
    private double additional_charge =15000.00;
    private double total_cost=0;
    private double length;
    private double width;

    private int balcony_cost;
    private int bedrooms;
    private double discount;
        
    //constructor
    StandardFinished(double length,double width, int finish_idx){
        super(length, width, finish_idx);
    }
    
    public void roomDetails(){
        System.out.println("Enter the length and width for each room in your house: ");
        System.out.println("\n");
  
        do{
          System.out.print("\t Length >> ");
        try{
          length = in.nextDouble();
        }
        catch(InputMismatchException e){
        System.out.println("Invalid input please enter a number for length.");
        in.next();
        }
        System.out.print("\t Width >> ");
        try{
          width = in.nextDouble();
        }
        catch(InputMismatchException e){
        System.out.println("Invalid input please enter a number for width.");
        in.next();
        }
        System.out.println("\n");
        if(length<width){
          System.out.println("Length cannot be greater than width.");
        }
        }while(length<12 || width<11 || length<width || length == width);
    }

    @Override
    public double compute_area() {
        room_area=length*width;
        //System.out.println("\n Room area " + room_area);
        return room_area;
    }
    //Taken to Super Standardclass
    @Override
    public double computeDiscount() {
        do{
            System.out.print("\t Enter number of bedrooms >>>");
        try{
            bedrooms=in.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
        if(bedrooms>1){
            discount=0.02;
        }
        }
        while(bedrooms>5);

        return discount;
    }

    //Taken to Super Standardclass??
    @Override
    public int setBalconies() {
        int balcony_number=0;
        do{
            System.out.print("\t Number of Balconies(atmost 3) >>> ");
        try{
            balcony_number=in.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Invalid Input");
        }
        }while(balcony_number>3);
        System.out.println("\n");
        if (balcony_number==1){
            balcony_cost=30000;
        }
        else if(balcony_number>1){
            balcony_cost+=30000+((balcony_number-1)*27500);
        }
        return balcony_number;
    }

    

    // to be retained
    @Override
    public double FinishPrice() {
        //taking care of additional charge
        base_price+=additional_charge;
        //taking care of extra room area charges inclusive extra rooms
        if (room_area>132){
            base_price+= (room_area-132)*7000;
            //System.out.println("\n A Standard room of " + length + "ft by " + width + "ft costs" + base_price);
        }
        //taking care of balconies costs
        base_price+=balcony_cost;
        //taking care of the discount
        System.out.println("\n After a discount of Ksh" + discount +"% ,\n The total price for your house is Ksh" + (base_price*=(1-discount)));
        return total_cost;    
    }

}
