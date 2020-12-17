package overridingMethods19;


public class Faculty19 extends Employee19 {
	private String officeHours;
	private String rank;
	
	public Faculty19(String officeHours, 
				String rank, 
				String office,
				double salary, 
				String name,
				String address, 
				String phoneNumber, 
				String e_mail) {
		super(office, salary,  name, address, phoneNumber, e_mail);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public String getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	public String getHour() {
		return rank;
	}
	public void setHour(String rank) {
		this.rank = rank;
	}
	
	public String toString() {
		return super.toString() + 
				"\nOffice hours: " + officeHours + 
				"\nRank: " + rank;
	}
}