package overridingMethods19;

import java.util.Date;

public class Account14copy2 {
	private static double yearInterestRate = 4.5;
	private int id;
	protected double balance;
	private Date dateCreated = new Date();
	
	Account14copy2(){
		setId(0);
		setBalance(0);
	
	}
	Account14copy2(int id, double balance){
		this.setId(id);
		this.setBalance(balance);
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getYearInterestRate() {
		return yearInterestRate;
	}

	public static void setYearInterestRate(double yrInterestRate) {
		yearInterestRate = yrInterestRate;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public static double getMonthlyInterestRate() {
		return yearInterestRate / 12;
	}
	public double getMonthlyInterest() {
		return balance * yearInterestRate / 12 / 100;
	}
	public void withdraw(double draw){
		balance -= draw;
	}
	public void deposit(double sum){
		balance += sum;
	}
	public String toString() {
		return "Balance: " + balance;
		
	}
}