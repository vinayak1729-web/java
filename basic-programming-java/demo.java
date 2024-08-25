
import java.util.Scanner;

public class demo  {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            // Input for the first array
            System.out.println("Enter the size of the first array: ");
            int size1 = input.nextInt();
            int[] arr1 = new int[size1];
            System.out.println("Enter elements of the first array: ");
            for (int i = 0; i < size1; i++) {
                arr1[i] = input.nextInt();
            }
    
            // Input for the second array
            System.out.println("Enter the size of the second array: ");
            int size2 = input.nextInt();
            int[] arr2 = new int[size2];
            System.out.println("Enter elements of the second array: ");
            for (int i = 0; i < size2; i++) {
                arr2[i] = input.nextInt();
            }
    
            // Finding and printing the intersection
            System.out.println("Intersection of the two arrays:");
            for (int i = 0; i < size1; i++) {
                for (int j = 0; j < size2; j++) {
                    if (arr1[i] == arr2[j]) {
                        System.out.println(arr1[i]);
                        break; // Break to avoid duplicate outputs for the same element
                    }
                }
            }
        }}
    