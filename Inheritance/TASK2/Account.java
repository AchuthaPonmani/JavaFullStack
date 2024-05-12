package TASK2;

public class Account {
    private double balance;

    // No-argument constructor
    public Account() {
        this.balance = 0;
    }

    // Parameterized constructor
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit amount to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        }
    }

    // Method to withdraw amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount for withdrawal.");
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating account objects using both constructors
        Account account1 = new Account();
        Account account2 = new Account(1000);

        // Depositing and withdrawing amounts from accounts
        account1.deposit(500);
        account2.withdraw(200);

        // Displaying balances of both accounts
        account1.displayBalance();
        account2.displayBalance();
}
}