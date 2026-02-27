// Base Class
class Student {
    int roll_no;

    void getRollNo(int r) {
        roll_no = r;
    }

    void displayRollNo() {
        System.out.println("Roll No: " + roll_no);
    }
}

// Derived Class 1
class Test extends Student {
    int sub1, sub2;

    void getMarks(int m1, int m2) {
        sub1 = m1;
        sub2 = m2;
    }

    void displayMarks() {
        System.out.println("Marks in Subject 1: " + sub1);
        System.out.println("Marks in Subject 2: " + sub2);
    }
}

// Derived Class 2
class Result extends Test {

    void displayResult() {
        int total = sub1 + sub2;
        System.out.println("Total Marks: " + total);
    }
}

// Main Class
public class multilevel {
    public static void main(String[] args) {

        Result obj = new Result();

        obj.getRollNo(17);
        obj.getMarks(75, 85);

        obj.displayRollNo();
        obj.displayMarks();
        obj.displayResult();
    }
}