import java.util.Scanner;


public class IndianBank {
	
	Scanner userInput = new Scanner(System.in);
	
	BankingCustomer[] bankingCustomers;
	
	 public IndianBank() {
	        // Initialize an array to store multiple BankingCustomer objects
	        BankingUtils bankingUtils = new BankingUtils();
	        this.bankingCustomers = bankingUtils.getAllBankingCustomerObjects();
	    }
	
	public void displayWelcomePage() {
		System.out.println("Welcome to Indian Bank !");
	}
	
	public boolean performLogin() {
        System.out.println("Enter your account no.");
        String userProvidedAccNo = userInput.nextLine();
        System.out.println("Enter your password");
        String userProvidedPassword = userInput.nextLine();

        for (BankingCustomer bankingCustomer : bankingCustomers) {
            if (userProvidedAccNo.equals(bankingCustomer.accountNo) &&
                userProvidedPassword.equals(bankingCustomer.password)) {
                System.out.println("Logging in");
                displayBankFunctionalities(bankingCustomer);
                return true;
            }
        }

        System.out.println("Bank account no/password don't match");
        return false;
    }
	
	 private BankingCustomer findCustomerByAccountNumber(String accountNumber) {
	        for (BankingCustomer customer : bankingCustomers) {
	            if (customer.accountNo.equals(accountNumber)) {
	                return customer;
	            }
	        }
	        return null;  // Customer not found
	    }
	
	
	void displayBankFunctionalities(BankingCustomer bankingCustomer) {
	    // Display banking functionalities for the specific customer
	    int userProvidedOption;

	    do {
	        System.out.println("Bank offers the following functionalities:");
	        System.out.println("1. Check Balance");
	        System.out.println("2. Deposit");
	        System.out.println("3. Withdraw");
	        System.out.println("4. Transfer");
	        System.out.println("======================================");
	        System.out.println("5. Logout");
	        System.out.println("======================================");
	        System.out.println("Enter options: 1 / 2 / 3 / 4 / 5");
	        System.out.println("======================================");
	        userProvidedOption = userInput.nextInt();
	        System.out.println("User selected option is: " + userProvidedOption);

	        switch (userProvidedOption) {
	            case 1:
	                double balanceAmount = bankingCustomer.checkBalance();
	                System.out.println(bankingCustomer.customerName + "\nYour balance is: " + balanceAmount);
	                System.out.println("Thankyou for banking with Indian Bank");
	                break;
	            case 2:
	                bankingCustomer.deposit();
	                break;
	            case 3:
	                bankingCustomer.withdraw();
	                break;
	            case 4:
	            	System.out.println("Enter the recipient's account number for transfer:");
	                String recipientAccNo = userInput.next();
	                BankingCustomer recipient = findCustomerByAccountNumber(recipientAccNo);
	                
	                if (recipient != null) {
	                	bankingCustomer.transfer(recipient);
	                } else {
	                    System.out.println("Recipient not found");
	                    System.out.println("Transfer Unsuccessful");
	                    System.out.println("Thankyou for banking with Indian Bank");
	                }
	                break;
	            case 5:
	            	bankingCustomer.logout();
	                break;
	            default:
	                System.out.println("Invalid option selected");
	                System.out.println("Valid selections are: 1 / 2 / 3 / 4 / 5");
	        }

	    } while (userProvidedOption < 0 || userProvidedOption > 5);
	}

		

}



