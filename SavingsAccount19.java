package overridingMethods19;

public class SavingsAccount19 extends Account14copy2 {
	
public SavingsAccount19(int id, double balance) {
		super(id, balance);
	}
	
	public void withdraw(double draw) {
		if(balance >= draw) {
			balance -= draw;
		} else {
			System.out.println("Error");
		}
	}
	public String toString() {
		return super.toString() + "\nSavings account";
	}
}