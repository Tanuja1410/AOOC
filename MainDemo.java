// Custom Exception Class
class DivisionException extends Exception {
    DivisionException(String message) {
        super(message);
    }
}

// Calculator Class
class Calculator {

    int divide(int a, int b) throws DivisionException {
        if (b == 0) {
            throw new DivisionException("Error: Division by zero is not allowed.");
        }
        return a / b;
    }
}

// Main Class
public class MainDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        try {
            int result = calc.divide(10, 0);   // change value to test
            System.out.println("Result: " + result);
        } catch (DivisionException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program executed successfully.");
    }
}