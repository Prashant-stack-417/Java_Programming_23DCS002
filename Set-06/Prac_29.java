import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Prac_29 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Prac_29 <file> <word>");
            return;
        }

        String fileName = args[0];
        String targetWord = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int wordCount = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equals(targetWord)) {
                        wordCount++;
                    }
                }
            }
            System.out.println("The word '" + targetWord + "' appears " + wordCount + " times in the file " + fileName);
        } catch (IOException e) {
            System.err.println("Error reading file " + fileName + ": " + e.getMessage());
        }

        // Wrapper Class Example
        Integer wrapperInt = Integer.valueOf(10); // Using Integer wrapper class
        int primitiveInt = wrapperInt.intValue(); // Converting back to primitive int
        System.out.println("Wrapper Class Example: Integer value is " + wrapperInt + " and primitive int value is " + primitiveInt);
    }
}