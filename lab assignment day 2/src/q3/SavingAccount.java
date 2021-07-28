package q3;

public class SavingAccount extends Account{

	private int interest=5;
	private int maxWithdrawLimit;
	private int minBalance=500;
	
	public SavingAccount(String memberName, double accountBalance, int maxWithdrawLimit) {
		super(memberName, accountBalance);
		this.maxWithdrawLimit = maxWithdrawLimit;
	}

	public double getBalance() {
		return super.getAccountBalance()+(super.getAccountBalance()*interest*0.01);
	}
	
	public void withdraw(double money) {
		if(money>maxWithdrawLimit) {
			System.out.println("you are withdrawing more than withdraw limit, not allowed");
			return ;
		}
		if(getBalance()>=money) {
			if(getBalance()-money>=minBalance) {
				this.deposit(super.getAccountBalance()*interest*0.01 - money);
			}else {
				System.out.println("Minimum balance limit, sorry");
			}
		}else {
			System.out.println("Balance less than withdraw amount");
		}
	}
	
}
