// Write a Java program that creates a class hierarchy for employees of a company. The base 
// class should be Employee, with subclasses Manager, Developer, and Programmer. Each 
// subclass should have properties such as name, address, salary, and job title. Implement 
// methods for calculating bonuses, generating performance reports, and managing projects. 

// Base Class
class Employee {
    String name;
    String address;
    double salary;
    String jobTitle;

    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }
    

    double calculateBonus() {
        return salary * 0.10;   // 10% bonus
    }

    void performanceReport() {
        System.out.println(jobTitle + " " + name + " is performing well.");
    }

    void manageProject() {
        System.out.println(name + " is managing a project.");
    }

    void display() {
        System.out.println("\nName: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Bonus: " + calculateBonus());
        performanceReport();
        manageProject();
    }
}

// Manager Class
class Manager extends Employee {

    Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    double calculateBonus() {
        return salary * 0.20;   // 20% bonus for Manager
    }
}
         
// Developer Class
class Developer extends Employee {

    Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    double calculateBonus() {
        return salary * 0.15;   // 15% bonus
    }
}

// Programmer Class
class Programmer extends Employee {

    Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    double calculateBonus() {
        return salary * 0.12;   // 12% bonus
    }
}

// Main Class
public class Company {
    public static void main(String[] args) {

        Manager m = new Manager("Tanuja", "Kolhapur", 80000);
        Developer d = new Developer("Amit", "Pune", 60000);
        Programmer p = new Programmer("Rohit", "Mumbai", 50000);

        m.display();
        d.display();
        p.display();
    }
}