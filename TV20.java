package polymorphism20;

public class TV20 extends Electronics20 {
   
    int size;
   
    /** Creates a new instance of TV */
    public TV20(double regularPrice,
              String manufacturer,
              int size) {
        super(regularPrice, manufacturer);
        this.size = size;
    }
   
    // Override this method
    public double computeSalePrice(){
        return super.getRegularPrice() * 0.8;
    }
}