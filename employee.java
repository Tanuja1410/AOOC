class employee {
    // Instance variables
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
        else
            this.monthlySalary = 0.0;
    }

    public static void main(String[] args) {
        // Create two employee objects
        employee emp1 = new employee("Raj", "Sharma", 3000);
        employee emp2 = new employee("Arjun", "Patil", 3500);

        // Display yearly salary of both employees
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + "'s yearly salary: " + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + "'s yearly salary: " + emp2.getYearlySalary());

        // Give a 10% raise to both employees
        emp1.giveRaise();
        emp2.giveRaise();

        // Display new yearly salary of both employees after the raise
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + "'s new yearly salary after raise: " + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + "'s new yearly salary after raise: " + emp2.getYearlySalary());
    }

    // Setter and Getter methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
        else
            this.monthlySalary = 0.0;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Method to calculate yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Method to give 10% raise
    public void giveRaise() {
        monthlySalary = monthlySalary + (monthlySalary * 0.10);
    }
}
