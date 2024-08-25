import java.util.Scanner;

public class sortarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = input.nextInt();
        System.out.println("Enter array elements: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        // Bubble Sort algorithm
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("-----------------------------");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        input.close();
    }
}
