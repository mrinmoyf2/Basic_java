import java.util.Scanner;  
public class larg{
    public static void main(String[] args){
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        // Close the Scanner to avoid resource leak
        scanner.close();

        //int[] arr = new int[]{10 , 2, 45,23, 56,23, 60};
        int max = numbers[0];

        for (int i= 0; i < numbers.length; i++){
            if(numbers[i]> max)
                max = numbers[i];
        }
        System.out.println("Largest element present in given array: " + max);  
    }
}