import java.util.*;

import javax.swing.JOptionPane;
abstract public class StandardRoom {
    JOptionPane  input = new JOptionPane();
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
    public double getLength()
    {
        return this.room_length;
    }
    public double getWidth()
    {
        return this.room_width;
    }
    //implemeted getter methods
    public double getArea(){
        return (this.room_area);
    }
    public int getBedrooms(){
        return this.bedrooms;
    }
    public int getBalconies(){

        return this.balcony_number;
    }

    public void roomDetails(){
       
        do{
             input.showMessageDialog(input, "Enter Room Dimensions", "ROOM DIMENSIONS", JOptionPane.INFORMATION_MESSAGE); 
       String lengthString = input.showInputDialog(input, "Length: ", "ROOM DIMENSIONS", JOptionPane.INFORMATION_MESSAGE);
        try{
          room_length = Double.parseDouble(lengthString);  
        }
        catch(InputMismatchException e){
        input.showMessageDialog(input, e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        String widthString = input.showInputDialog(input, "Width: ", "ROOM DIMENSIONS", JOptionPane.INFORMATION_MESSAGE);
               try{
          
           room_width = Double.parseDouble(widthString);
        }
        catch(InputMismatchException e){
        input.showMessageDialog(input, e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        if (room_length<room_width){
            input.showMessageDialog(input, "Length cannot be less than the width", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("\n");
        }while(room_length<12 || room_width<11 || room_length<room_width || room_length == room_width);
    }
    public double compute_area() {
        this.room_area = room_length * room_width;
        
        return this.room_area;
    }
    public int setBedrooms(){
        do{
       input.showMessageDialog(input, "Enter the number of rooms: ", "NUMBER OF ROOMS", JOptionPane.INFORMATION_MESSAGE);
        try{
           String rooms = input.showInputDialog(input, "Rooms: ", "NUMBER OF ROOMS", JOptionPane.INFORMATION_MESSAGE);
           bedrooms = Integer.parseInt(rooms);
        }
        catch(InputMismatchException e){
        input.showMessageDialog(input, e, null, JOptionPane.ERROR_MESSAGE);
        }
        }
        while(bedrooms>5);
        return bedrooms;
    }
    public double setBalconies(){
        do{
         input.showMessageDialog(input, "Enter the number of balconies", null, JOptionPane.INFORMATION_MESSAGE);
        try{
        String bals = input.showInputDialog(input, "BALCONIES\nMaximum number of balconies is three:\n ", null,JOptionPane.INFORMATION_MESSAGE);
        this.balcony_number = Integer.parseInt(bals);
        }
        catch(InputMismatchException e){
            input.showMessageDialog(input, e, null, JOptionPane.ERROR_MESSAGE);
        }

        }while(balcony_number > 3 || balcony_number < 0);
       // System.out.println("\n");
        if (this.balcony_number == 1){
            balcony_cost=30000;
            //input.showMessageDialog(input, "Balcony Cost\n", "BALCONY COST", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(this.balcony_number > 1){
            balcony_cost += 30000 + ((balcony_number - 1) * 27500);
            //System.out.println("\t balcony price = Ksh"+balcony_cost);
        }
        return balcony_cost;
    }
    public double computeDiscount() {
        if(bedrooms > 1){
            discount = 0.02 * base_price;
        }
        return discount;
    }
}