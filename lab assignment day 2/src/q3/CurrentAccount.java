package q3;

public class CurrentAccount extends Account {
	private int tradeLicenseNumber;

	public CurrentAccount(String memberName, double accountBalance,int tradeLicenseNumber) {
		super(memberName,accountBalance);
		this.tradeLicenseNumber=tradeLicenseNumber;
	}
	
	public double getBalance() {
		return super.getAccountBalance();
	}

	public void withdraw(double amount) {

		if (getBalance() >= amount) {
			deposit(-1*amount);
			System.out.println("***Amount Withdrawn***");
		} else {
			System.out.println("You don't have sufficient balance in your account");
		}

	}
}
