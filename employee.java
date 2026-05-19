// class employee {
//     // Instance variables
//     private String firstName;                         
//     private String lastName;
//     private double monthlySalary;

//     // Constructor
//     public employee(String firstName, String lastName, double monthlySalary) {
//         this.firstName = firstName;
//         this.lastName = lastName;

//         if (monthlySalary > 0)
public class employee {
    private String firstname;
    private String lastname;
    private double monthlysalary;

    public employee(String firstname, String lastname, double monthlysalary) {
        this.firstname = firstname;
        this.lastname = lastname;
        if (monthlysalary > 0)
            this.monthlysalary = monthlysalary;
        else
            this.monthlysalary = 0.0;
    }

    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }

    public double getMonthlysalary() { return monthlysalary; }
    public void setMonthlysalary(double monthlysalary) {
        if (monthlysalary > 0)
            this.monthlysalary = monthlysalary;
        else
            this.monthlysalary = 0.0;
    }

    public double getYearlySalary() { return monthlysalary * 12; }

    public void giveRaise() { monthlysalary = monthlysalary + (monthlysalary * 0.10); }

    public static void main(String[] args) {
        employee emp1 = new employee("Raj", "Sharma", 1000);
        employee emp2 = new employee("Amit", "Patil", 2000);

        System.out.println(emp1.getFirstname() + " " + emp1.getLastname() + " yearly salary: " + emp1.getYearlySalary());
        System.out.println(emp2.getFirstname() + " " + emp2.getLastname() + " yearly salary: " + emp2.getYearlySalary());

        emp1.giveRaise();
        emp2.giveRaise();

        System.out.println(emp1.getFirstname() + " " + emp1.getLastname() + " new yearly salary after raise: " + emp1.getYearlySalary());
        System.out.println(emp2.getFirstname() + " " + emp2.getLastname() + " new yearly salary after raise: " + emp2.getYearlySalary());
    }
}