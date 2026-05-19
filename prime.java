class prime {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Usage: java Prime ");
            return;
        }

        int n;

        try {
            n = Integer.parseInt(args[0]);
        } 
        catch (NumberFormatException e) {
            System.out.println("Please enter a valid number");
            return;
        }

        if (n <= 1) {
            System.out.println(n + " is not a Prime Number");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(n + " is a Prime Number");
        else
            System.out.println(n + " is not a Prime Number");
    }
}