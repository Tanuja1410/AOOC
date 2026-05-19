


import java.util.Arrays;                                   

class AlphabeticalNames {
    public static void main(String[] args) {

        // Array of names
        String[] names = {
            "Tanuja", "Amit", "Rohit", "Sneha", "Pooja",
            "Kunal", "Neha", "Rahul", "Raj", "Suresh"
        };

        // Sort the names alphabetically
        Arrays.sort(names);

        // Print the sorted names
        System.out.println("Names in Alphabetical Order:");
        
        for (String name : names) {
            System.out.println(name);
        }
    }
}


