abstract public class StandardRoom {
    private double room_length;
    private double room_width;
    private double base_price = 850000;

    public StandardRoom(double length, double width)
    {
        this.room_length = length;
        this.room_width = width;
    }

    abstract public void compute_area();
  

}
