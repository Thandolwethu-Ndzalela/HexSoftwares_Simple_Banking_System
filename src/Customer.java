import java.util.HashMap;
import java.util.Map;

// Represents a customer with a name and a collection of bank accounts
public class Customer {
    private String name;
    private Map<String, BankAccount> accounts; // Map to store multiple accounts (accountNumber -> BankAccount)

    // Constructor to initialize the customer with a name
    public Customer(String name) {
        this.name = name;
        this.accounts = new HashMap<>();
    }

    // Method to get the customer's name
    public String getName() {
        return name;
    }

    // Method to create a new account for the customer
    public void createAccount(String accountNumber, double initialBalance) {
        if (!accounts.containsKey(accountNumber)) {
            accounts.put(accountNumber, new BankAccount(initialBalance));
            System.out.println("Account created successfully.");
        } else {
            System.out.println("Account already exists.");
        }
    }

    // Method to retrieve a specific account by account number
    public BankAccount getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
}
