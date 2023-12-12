import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");

        String userInput = scanner.nextLine();
        scanner.close();
        
        String reversedString = reverseString(userInput);
        System.out.println("Reversed string: " + reversedString);
    }

    private static String reverseString(String original) {

        StringBuilder stringBuilder = new StringBuilder(original);

        stringBuilder.reverse();

        return stringBuilder.toString();
    }
}
