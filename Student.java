// Write a program to perform Multilevel Inheritance
// student     roll_no 

// test        sub1, sub2

// result      displaay result



// Parent class
class Student {
    int roll_no = 101;

    void displayRoll() {
        System.out.println("Roll Number: " + roll_no);
    }

    public static void main(String[] args) {
        // create Result object and demonstrate multilevel inheritance
        Result r = new Result();
        r.displayRoll();
        r.displayMarks();
        r.displayResult();
    }
}

// Child class
class Test extends Student {
    int sub1 = 80;
    int sub2 = 90;

    void displayMarks() {
        System.out.println("Marks in Subject 1: " + sub1);
        System.out.println("Marks in Subject 2: " + sub2);
    }
}

// Grandchild class
class Result extends Test {

    void displayResult() {
        int total = sub1 + sub2;
        System.out.println("Total Marks: " + total);
    }

// main class
    public static void main(String[] args) {

        // Creating object of Result class
        Result r = new Result();

        r.displayRoll();
        r.displayMarks();
        r.displayResult();
    }
}