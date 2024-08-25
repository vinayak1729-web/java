package array;

import java.util.Scanner;

public class IV_remove_duplicate_from_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers, each followed by the Enter key:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("The array is:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        int newsize = size;
        for (int i = 0; i < newsize; i++) {
            for (int j = i + 1; j < newsize; j++) {
                if (arr[i] == arr[j]) {
                    // Shift elements to the left
                    for (int k = j; k < newsize - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    newsize--; // Reduce the size of the array
                    j--; // Check the current position again since elements are shifted
                }
            }
        }

        System.out.println("The new array without duplicates is:");
        for (int i = 0; i < newsize; i++) {
            System.out.println(arr[i]);
        }
    }
}
