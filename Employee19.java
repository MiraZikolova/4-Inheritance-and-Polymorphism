package overridingMethods19;

import java.util.Date;

public class Employee19 extends Person19 {
	private String office;
	private double salary;
	private Date dateHired = new Date();
	
	public Employee19(  String office, 
						double salary, 
						String name,
						String address,
						String phoneNumber,
						String e_mail) {
		super(name, address, phoneNumber, e_mail);
		this.office = office;
		this.salary = salary;

	}
	
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getDateHired() {
		return dateHired;
	}
	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}
	
	public String toString() {
		return super.toString() + "\nOffice: " + office
				+ "\nSalary: " + salary + 
				"\nDate hired: " + dateHired.toString();
	}
}
