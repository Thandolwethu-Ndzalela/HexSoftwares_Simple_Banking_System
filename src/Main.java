import java.util.Scanner;

// Main class to run the banking system
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the customer's name
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        // Create a new customer with the provided name
        Customer customer = new Customer(name);

        // Main menu loop
        while (true) {
            System.out.println("\n1. Create Account\n2. Deposit\n3. Withdraw\n4. Check Balance\n5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            // Handle user's choice
            switch (choice) {
                case 1: // Create a new account
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.next();
                    System.out.print("Enter initial deposit amount: ");
                    double initialDeposit = scanner.nextDouble();
                    customer.createAccount(accountNumber, initialDeposit);
                    break;
                case 2: // Deposit money into an account
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    BankAccount account = customer.getAccount(accountNumber);
                    if (account != null) {
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3: // Withdraw money from an account
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    account = customer.getAccount(accountNumber);
                    if (account != null) {
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawalAmount = scanner.nextDouble();
                        account.withdraw(withdrawalAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4: // Check the balance of an account
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    account = customer.getAccount(accountNumber);
                    if (account != null) {
                        account.displayBalance();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5: // Exit the program
                    System.out.println("Thank you for using our banking system.");
                    scanner.close();
                    return;
                default: // Handle invalid options
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}