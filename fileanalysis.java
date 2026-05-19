import java.io.*;

public class fileanalysis {
    public static void main(String[] args) {

        int vowels = 0;
        int words = 0;
        int countA = 0;

        try {
            FileReader fr = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {

                // Count words
                String w[] = line.split("\\s+");
                words += w.length;

                // Count vowels and 'a'
                for (int i = 0; i < line.length(); i++) {
                    char ch = Character.toLowerCase(line.charAt(i));

                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowels++;
                    }

                    if (ch == 'a') {
                        countA++;
                    }
                }
            }

            br.close();

            System.out.println("Total number of vowels: " + vowels);
            System.out.println("Total number of words: " + words);
            System.out.println("Number of times 'a' appears: " + countA);

        } 
        catch (Exception e) {
            System.out.println("Error reading file: " + e);
        }
    }
}