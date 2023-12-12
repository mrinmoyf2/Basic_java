import java.util.Arrays;
import java.util.Scanner;  

public class merge_unsorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");

        int size = scanner.nextInt();

        int[] array1 = new int[size];
        int[] array2 = new int[size];

        System.out.println("Enter elements for first array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter elements for Second array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            array2[i] = scanner.nextInt();
        }
        scanner.close();

        int[] mergedArray = mergeArrays(array1, array2);
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
    public static int[] mergeArrays(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        int[] mergedArray = new int[length1 + length2];

        // Copy elements of array1 to mergedArray
        System.arraycopy(array1, 0, mergedArray, 0, length1);

        // Copy elements of array2 to mergedArray
        System.arraycopy(array2, 0, mergedArray, length1, length2);

        return mergedArray;
    }
}
