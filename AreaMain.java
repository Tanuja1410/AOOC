// class area {
//     int length;
//     int breadth;

//     void setDim(int l, int b) {
//         length = l;
//         breadth = b;
//     }

//     int getArea() {
//         return length * breadth;
//     }
// }

// public class AreaMain {
//     public static void main(String[] args) {

//         area a = new area();   // object created

//         a.setDim(5, 4);       // setting values
//         System.out.println("Area = " + a.getArea());
//     }
// }


class area {
    int length;
    int breadth;

    void setDim(int l, int b) {
        length = l;
        breadth = b;
    }

    int getArea() {
        return length * breadth;
    }
}

public class AreaMain {
    public static void main(String[] args) {

        area a = new area();   // object created

        a.setDim(14,10);       // setting values
        System.out.println("Area = " + a.getArea());
    }
}