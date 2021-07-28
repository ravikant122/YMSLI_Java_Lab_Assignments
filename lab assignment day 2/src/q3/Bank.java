package q3;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account=null;
		
		System.out.println("Enter 1 :Current Account");
		System.out.println("Enter 2 :Saving Account");
		int typeOfAccount = sc.nextInt();

		System.out.println("Enter the username : ");
		String userName = sc.next();
		
		System.out.println("Enter the initial balance");
		double initialBalance = sc.nextDouble();

		if (typeOfAccount == 1) {
			// open a current account
			System.out.println("Enter your trade license number");
			int tradeLicenseNumber = sc.nextInt();
			account = new CurrentAccount(userName, initialBalance, tradeLicenseNumber);
		} else {
			// open a saving account
			System.out.println("Enter the max withdraw limit");
			int maxWithdrawLimit = sc.nextInt();
			account = new SavingAccount(userName, initialBalance, maxWithdrawLimit);
		}

		int choice=0;
		do {

			System.out.println("Enter 1:Deposit Money");
			System.out.println("Enter 2:Withdraw Money");
			System.out.println("Enter 3:Display Balance");
			System.out.println("Enter 0:Exit");
			choice = sc.nextInt();
			
			if(choice==1) {
				System.out.println("Enter the amount you want to deposit");
				double depositAmount = sc.nextDouble();
				account.deposit(depositAmount);
			}
			else if(choice==2) {
				System.out.println("Enter the amount you want to withdraw");
				double withdrawAmount = sc.nextDouble();
				((SavingAccount)account).withdraw(withdrawAmount);
			}
			else if(choice==3) {
				System.out.println(account.getAccountBalance());
			}
			else if(choice==4) {
				System.out.println("Exiting the system");
			}
			else {
				System.out.println("Wrong Input");
				break;
			}

		} while (choice!=0);
		sc.close();
		
		System.out.println("***Exit Successfully***");
	}

}
