import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Prac_28 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java CharCount <file> <character>");
            return;
        }

        String fileName = args[0];
        char targetChar = args[1].charAt(0);

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int charCount = 0;
            int c;
            while ((c = reader.read()) != -1) {
                if (c == targetChar) {
                    charCount++;
                }
            }
            System.out.println("The character '" + targetChar + "' appears " + charCount + " times in the file " + fileName);
        } catch (IOException e) {
            System.err.println("Error reading file " + fileName + ": " + e.getMessage());
        }
    }
}