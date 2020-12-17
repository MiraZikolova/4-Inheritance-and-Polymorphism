package polymorphism20;

public class ChildrensBook20 extends Book20 {
	private int age;
	
	public ChildrensBook20(double regularPrice,
							String publisher, 
							int yearPublished,
							int age){
            	super(regularPrice, publisher, yearPublished);
            	setAge(age);
            
	}
	// Overriding
	public double computeSalePrice(){
        return super.getRegularPrice() * 0.3;
    }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}