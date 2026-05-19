import java.io.*;
import java.util.Scanner;

public class studentfiledata {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Accept student information
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Weight: ");
            float weight = sc.nextFloat();

            System.out.print("Enter Height: ");
            float height = sc.nextFloat();

            sc.nextLine(); // consume leftover newline

            System.out.print("Enter City: ");
            String city = sc.nextLine();

            System.out.print("Enter Phone Number: ");
            long phone = sc.nextLong();

            // Writing data to file
            FileOutputStream fos = new FileOutputStream("student.dat");
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeUTF(name);
            dos.writeInt(age);
            dos.writeFloat(weight);
            dos.writeFloat(height);
            dos.writeUTF(city);
            dos.writeLong(phone);

            dos.close();
            fos.close();

            System.out.println("\nData successfully written to file.");

            // Reading data from file
            FileInputStream fis = new FileInputStream("student.dat");
            DataInputStream dis = new DataInputStream(fis);

            System.out.println("\nStudent Data from File:");

            System.out.println("Name: " + dis.readUTF());
            System.out.println("Age: " + dis.readInt());
            System.out.println("Weight: " + dis.readFloat());
            System.out.println("Height: " + dis.readFloat());
            System.out.println("City: " + dis.readUTF());
            System.out.println("Phone Number: " + dis.readLong());

            dis.close();
            fis.close();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        sc.close();
    }
}