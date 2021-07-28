package q3;

public class Account {
	private String memberName;
	private String accountNumber;
	private double accountBalance;
	
	public Account(String memberName, double accountBalance) {
		this.memberName = memberName;
		this.accountNumber=10000 + (int)(Math.random()*89999) + "";
		this.accountBalance = accountBalance;
	}
	
	public void deposit(double newMoney) {
		this.accountBalance+=newMoney;
	}

	public String getMemberName() {
		return memberName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	
}
