package questions.exam.java;
import java.io.*;

public class MOdifiedREadWithStringBuiler  {
    public static void main(String[] args) {
        File vowelFile = new File("Vowel.txt");
        File consonantFile = new File("Consonant.txt");

        if (vowelFile.exists() && consonantFile.exists()) {
            try {
                FileReader vowelReader = new FileReader(vowelFile);
                FileReader consonantReader = new FileReader(consonantFile);
                
                // Read the contents of the vowel file into a string
                StringBuilder vowelBuilder = new StringBuilder();
                int vowelChar = vowelReader.read();
                while (vowelChar != -1) {
                    vowelBuilder.append((char) vowelChar);
                    vowelChar = vowelReader.read();
                }
                String vowelContent = vowelBuilder.toString();
                
                // Read the contents of the consonant file into a string
                StringBuilder consonantBuilder = new StringBuilder();
                int consonantChar = consonantReader.read();
                while (consonantChar != -1) {
                    consonantBuilder.append((char) consonantChar);
                    consonantChar = consonantReader.read();
                }
                String consonantContent = consonantBuilder.toString();

                // Print the contents of the files as strings
                System.out.println("Vowels: " + vowelContent);
                System.out.println("Consonants: " + consonantContent);

                // Close the readers
                vowelReader.close();
                consonantReader.close();
            } catch (IOException e) {
                System.out.println("An IO Exception occurred: " + e.getMessage());
            }
        } else {
            System.out.println("One or both files do not exist!");
        }
    }
}
