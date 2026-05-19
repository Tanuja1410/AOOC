import java.util.Scanner;

// User Defined Exception for Low Balance
class LowBalanceException extends Exception {
    LowBalanceException(String message) {
        super(message);
    }
}

// User Defined Exception for Negative Number
class NegativeNumberException extends Exception {
    NegativeNumberException(String message) {
        super(message);
    }
}

// BankAccount Class
class BankAccountDemo {
    double balance;

    BankAccountDemo(double balance) {
        this.balance = balance;
    }

    // Balance Enquiry
    void balanceEnquiry() {
        System.out.println("Current Balance: " + balance);
    }

    // Deposit Method
    void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Amount cannot be negative.");
        }
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    // Withdraw Method
    void withdraw(double amount) throws LowBalanceException, NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Amount cannot be negative.");
        }
        if (amount > balance) {
            throw new LowBalanceException("Insufficient Balance.");
        }
        balance -= amount;
        System.out.println("Amount Withdrawn: " + amount);
    }
}

// Main Class
public class BankDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccountDemo acc = new BankAccountDemo(1000);

        try {
            acc.balanceEnquiry();

            System.out.print("Enter deposit amount: ");
            double d = sc.nextDouble();
            acc.deposit(d);

            acc.balanceEnquiry();

            System.out.print("Enter withdrawal amount: ");
            double w = sc.nextDouble();
            acc.withdraw(w);

            acc.balanceEnquiry();

        } catch (LowBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (NegativeNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}