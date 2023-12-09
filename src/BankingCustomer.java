import java.util.Scanner;;


public class BankingCustomer {
	
	String customerName;
	String accountNo;
	String password;
	double balance;
	
	Scanner userInput = new Scanner(System.in);
	
	public BankingCustomer(String name,String accountNo, String password) {
		this.customerName = name;
		this.accountNo = accountNo;
		this.password = password;
		balance = 5000;
	}
	
	public double checkBalance() {
		System.out.println("Checking the balance details");
		return balance;
	}
	
	public double deposit() {
		System.out.println("Enter the amount you want to deposit");
		double userDepositedAmount = userInput.nextDouble();
		if(userDepositedAmount>0) {
			balance = balance + userDepositedAmount;
			System.out.println("Deposit successful");
			System.out.println("Updated account balance is : " + balance);
			System.out.println("Thankyou for banking with Indian Bank");
		}else {
			System.out.println("You cannot enter negative amount " + userDepositedAmount);
			System.out.println("Deposit operation cancelled");
			System.out.println("Thankyou for banking with Indian Bank");
		}
		return balance;

	}
	
	public double withdraw() {
		System.out.println("Enter the amount you want to withdraw");
		double withdrawnAmount = userInput.nextDouble();
		if(withdrawnAmount>0 && withdrawnAmount < balance) {
			balance = balance - withdrawnAmount;
			System.out.println("Withdraw successful");
			System.out.println("Updated account balance is : " + balance);
			System.out.println("Thankyou for banking with Indian Bank");
		}else {
			System.out.println("Enter within your balance amount");
			System.out.println("You balance is : " + balance);
			System.out.println("Withdrawn operation cancelled");
			System.out.println("Thankyou for banking with Indian Bank");
		}
		return balance;

	}
	
	public double transfer(BankingCustomer recipient) {
	    System.out.println("Enter the amount you want to transfer");
	    double transferAmount = userInput.nextDouble();

	    if (transferAmount > 0 && transferAmount <= balance) {
	        balance -= transferAmount;
	        recipient.balance += transferAmount;
	        System.out.println("Transfer successful");
	        System.out.println("Updated account balance is : " + balance);
	        System.out.println("Thank you for banking with Indian Bank");
	    } else {
	        System.out.println("Invalid transfer amount or insufficient balance");
	        System.out.println("Your balance is : " + balance);
	        System.out.println("Transfer operation cancelled");
	        System.out.println("Thank you for banking with Indian Bank");
	    }

	    return balance;
	}

	public void logout() {
	    System.out.println("Logout successful");
	    System.out.println("Thank you for banking with Indian Bank");
	}

	
	
	
}
