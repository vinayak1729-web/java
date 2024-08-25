
import java.util.Scanner;

public class V_delete_dublicate_from_array {
    public static void main(String[] args) {
        System.out.println("enter the size of array : ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("the enter array elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("the entered array : ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        int newsize = size;
        for (int i = 0; i < newsize; i++) {
            for (int j = i + 1; j < newsize; j++) {
                if (arr[i] == arr[j]) {
                    for (int k = j; k < newsize - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    newsize--;
                    j--;
                }

                
            }

        }
        System.out.println("the new array is  : ");
        for (int i = 0; i < newsize; i++) {
            System.out.println(arr[i]);
        }
       
    }
}