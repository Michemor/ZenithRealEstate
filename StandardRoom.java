import java.util.*;
abstract public class StandardRoom {
    Scanner in = new Scanner(System.in);
    double room_length;
    double room_width;
    double base_price = 850000;
    double base_area = 132;
    double balcony_cost = 0;
    int bedrooms;
    double room_area;
    double discount;
    int balcony_number;

    abstract public double FinishPrice();

    public StandardRoom(){
        
    }
    //implemeted getter methods
     public double getArea(){
        return base_area;
    }
    public int getBedrooms(){
        return bedrooms;
    }
    public int getBalconies(){
        return balcony_number;
    }

    public void roomDetails(){
        System.out.println("\n Enter the length and width for each room in your house: ");
  
        do{
          System.out.print("\t Length >> ");
        try{
          room_length = in.nextDouble();
        }
        catch(InputMismatchException e){
        System.out.println("Invalid input please enter a number for length.");
        in.next();
        }
        System.out.print("\t Width >> ");
        try{
          room_width = in.nextDouble();
        }
        catch(InputMismatchException e){
        System.out.println("Invalid input please enter a number for width.");
        in.next();
        }
        if (room_length<room_width){
            System.out.println("\t INVALID Length CANNOT be LESS than Width");
        }
        System.out.println("\n");
        }while(room_length<12 || room_width<11 || room_length<room_width || room_length == room_width);
    }
    public double compute_area() {
        room_area=room_length*room_width;
        //System.out.println("room area = " + room_area);
        return room_area;
    }
    public int setBedrooms(){
        do{
        System.out.print("\n \t Enter number of bedrooms >>>");
        try{
            bedrooms=in.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
        }
        while(bedrooms>5);
        return bedrooms;
    }
    public int setBalconies(){
        do{
            System.out.print("\n \t Number of Balconies(atmost 3) >>> ");
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
            System.out.println("\t balcony price = Ksh"+balcony_cost);
        }
        else if(balcony_number>1){
            balcony_cost+=30000+((balcony_number-1)*27500);
            System.out.println("\t balcony price = Ksh"+balcony_cost);
        }
        return balcony_number;
    }
    public double computeDiscount() {
        if(bedrooms>1){
            discount=0.02*base_price;
        }
        return discount;
    }
}