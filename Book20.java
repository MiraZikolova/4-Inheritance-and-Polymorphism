package polymorphism20;

public class Book20 extends Product20{
   
    private String publisher;
    private int yearPublished;
   
    /** Creates a new instance of Book */
    public Book20(double regularPrice,
            String publisher,
            int yearPublished) {
        super(regularPrice);
        this.publisher = publisher;
        this.yearPublished = yearPublished;
    }
   
    // Override this method
    public double computeSalePrice(){
        return super.getRegularPrice() * 0.5;
    }
   
    public String getPublisher() {
        return publisher;
    }
   
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
   
    public int getYearPublished() {
        return yearPublished;
    }
   
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
   
}