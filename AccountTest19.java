package overridingMethods19;

public class AccountTest19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount19 acc1 = new SavingsAccount19(2200, 1100);
		CheckingAccount19 acc2 = new CheckingAccount19(2300, 900, 5000);
		acc1.withdraw(100);
		System.out.println(acc1.getId() + ": \n" + acc1.toString());
		acc2.withdraw(3000);
		System.out.println(acc2.getId() + ": \n" + acc2.toString());
		acc1.withdraw(400);
		System.out.println(acc1.getId() + ": \n" + acc1.toString());
		acc2.withdraw(2500);
		System.out.println(acc2.getId() + ": \n" + acc2.toString());
		acc2.deposit(600);
		System.out.println(acc2.getId() + ": \n" + acc2.toString());
	}

}