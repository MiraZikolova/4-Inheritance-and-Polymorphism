package polymorphism20;

public class Electronics20 extends Product20{
   
    private String manufacturer;
   
    /** Creates a new instance of Electronics */
    public Electronics20(double regularPrice,
            String manufacturer) {
        super(regularPrice);
        this.manufacturer = manufacturer;
    }
   
    // Override this method
    public double computeSalePrice(){
        return super.getRegularPrice() * 0.6;
    }
   
    public String getManufacturer() {
        return manufacturer;
    }
   
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
   
}