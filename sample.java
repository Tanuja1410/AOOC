import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class sample {
    public static void main(String[] args) {
        try {
            // Specify full path of file located outside program folder
            File file = new File("C:\\Users\\Public\\sample.txt");

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("Reading data from file:\n");

            // Read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } 
        catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}