// Represents a bank account with a balance
public class BankAccount {
    private double balance;

    // Constructor to initialize the account with an initial balance
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Invalid initial balance. Setting balance to 0.");
            this.balance = 0;
        }
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposit successful. New balance: R%.2f%n", balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrawal successful. New balance: R%.2f%n", balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Method to get the current balance of the account
    public double getBalance() {
        return balance;
    }

    // Method to display the balance with 2 decimal places
    public void displayBalance() {
        System.out.printf("Current balance: R%.2f%n", balance);
    }
}
