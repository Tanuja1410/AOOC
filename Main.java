// Superclass
class BankAccount {
    protected double balance;

    // Constructor
    BankAccount(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Subclass
class SavingsAccount extends BankAccount {

    // Constructor
    SavingsAccount(double balance) {
        super(balance);
    }

    // Overriding withdraw() method
    @Override
    public void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied! Minimum balance of 100 must be maintained.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount(500);

        account.deposit(200);     // Balance = 700
        account.withdraw(550);    // Allowed (Balance = 150)
        account.withdraw(100);    // Denied (Would go below 100)
        account.displayBalance();
    }
}