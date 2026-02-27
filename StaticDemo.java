class StaticDemo {

    // Static variable
    static int number;

    // Static block
    static {
        number = 10;
        System.out.println("Static block executed");
    }

    // Static method
    static void display() {
        System.out.println("Value of static variable = " + number);
    }

    public static void main(String[] args) {
        // Calling static method
        StaticDemo.display();
    }
}
