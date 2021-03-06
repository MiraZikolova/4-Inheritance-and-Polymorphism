package overridingMethods19;


public class Staff19 extends Employee19 {
	private String title;

	public Staff19(String title, 
				String office,
				double salary, 
				String name,
				String address, 
				String phoneNumber, 
				String e_mail) {
		super(  office, 
				salary,  
				name,
				address, 
				phoneNumber,
				e_mail);
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString() {
		return super.toString() +
				"\nTitle: " + title;
	}
}