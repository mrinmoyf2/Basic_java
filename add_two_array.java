import java.util.Arrays;
import java.util.Scanner;  

public class add_two_array{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");

        int size = scanner.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        System.out.println("Enter elements for first array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Enter elements for Second array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr2[i] = scanner.nextInt();
        }
        
        int[] resultArray = new int[arr1.length];

        for (int i = 0; i < size; i++) {
            resultArray[i] = arr1[i] + arr2[i];
        }
        System.out.println("Result of element-wise addition: " + Arrays.toString(resultArray));

    }
}