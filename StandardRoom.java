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
        inpu.showMessageDialog(input, "Enter Room Dimensions", "ROOM DIMENSIONS", JOptionPane.INFORMATION_MESSAGE); 
        do{
       String lengthString = input.showMessageDialog(input, "Length: ", "ROOM DIMENSIONS", JOptionPane.INFORMATION_MESSAGE);
        try{
          room_length = Double.parseDouble(lengthString);  
        }
        catch(InputMismatchException e){
        input.showMessageDialog(input, e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
               try{
           String widthString = input.showInputDialog(input, "Width: ", "ROOM DIMENSIONS",JOptionPane.INFORMATION_MESSAGE);
           width = Double.parseDouble(widthString);
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
        room_area=room_length*room_width;
        //System.out.println("room area = " + room_area);
        return room_area;
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
        String bals = input.showInputDialog(input, "BALCONIES\nMaximum number of balconies is three:() ", null,JOptionPane.INFORMATION_MESSAGE);
        }
        catch(InputMismatchException e){
            input.showMessageDialog(input, e, null, JOptionPane.ERROR_MESSAGE);
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
        return balcony_cost;
    }
    public double computeDiscount() {
        if(bedrooms>1){
            discount=0.02*base_price;
        }
        return discount;
    }
}