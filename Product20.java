package polymorphism20;

public class Product20 {
   
    private double regularPrice;
   
    /** Creates a new instance of Product */
    public Product20(double regularPrice) {
        this.regularPrice = regularPrice;
    }
   
    // Method that will be overridden
    public double computeSalePrice(){
        return 0;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
   
}