package polymorphism20;

public class MP3Player20 extends Electronics20{
   
    private String color;
   
    /**
     * Creates a new instance of MP3Player
     */
    public MP3Player20(double regularPrice,
                String manufacturer,
                String color) {
        super(regularPrice, manufacturer);
        this.color = color;
    }
   
    // Override this method
    public double computeSalePrice(){
        return super.getRegularPrice() * 0.9;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}