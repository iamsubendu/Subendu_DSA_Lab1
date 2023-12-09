public class BankingUtils {

    // Collection of objects
    public BankingCustomer[] getAllBankingCustomerObjects() {

        // Creating an array of BankingCustomer objects
        BankingCustomer[] bankingCustomers = new BankingCustomer[5];

        // Initializing a BankingCustomer object with the required parameters
        bankingCustomers[0] = new BankingCustomer("Badshah","1234567890", "badshah");
        
        bankingCustomers[1] = new BankingCustomer("Ali","2234567890", "badshah");
        
        bankingCustomers[2] = new BankingCustomer("Somu","1234567899", "badshah");
        
        bankingCustomers[3] = new BankingCustomer("Chotu","1234567800", "badshah");
        
        bankingCustomers[4] = new BankingCustomer("Rakesh","1234567790", "badshah");

        // Returning the array of BankingCustomer objects
        return bankingCustomers;
    }
}
