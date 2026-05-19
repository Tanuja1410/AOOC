import java.util.Scanner;

// User-defined Exception
class OddNumberException extends Exception {
    OddNumberException(String message) {
        super(message);
    }
}

class NumberCheck {

    // Method to check number
    void checkNumber(int num) throws OddNumberException {
        if (num % 2 != 0) {
            throw new OddNumberException("Number is Odd. Exception Thrown!");
        } else {
            System.out.println("Number is Even.");
        }
    }
}

public class OddExceptionDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NumberCheck obj = new NumberCheck();

        try {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            obj.checkNumber(n);
        }

        catch (OddNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}