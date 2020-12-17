package overridingMethods19;

public class CheckingAccount19 extends Account14copy2 {
	private double overdraftLimit;

	public CheckingAccount19(int id, double balance, double overdraftLimit) {
		super(id, balance);
		setOverdraftLimit(overdraftLimit);
	}
	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	public void withdraw(double draw) {
		if(balance + overdraftLimit >= draw) {
			balance -= draw;
		} else {
			System.out.println("Error");
		}
	}
	public String toString() {
		return super.toString() + "\nChecking account";
	}
}