import java.util.Scanner;

public class larg_word {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();
            scanner.close();
    
            int maxLength = findLongestWordLength(inputString);
            System.out.println("The length of the longest word is: " + maxLength);
        }
    
        static int findLongestWordLength(String str) {
            // Split the string into words
            String[] words = str.split("\\s+");
            int maxLength = 0;
            for (String word : words) {
                word = word.replaceAll("[^a-zA-Z]", "");
                if (word.length() > maxLength) {
                    maxLength = word.length();
                    // String longestWord = word;
                }
            }
    
            return maxLength;
        }
    
}
