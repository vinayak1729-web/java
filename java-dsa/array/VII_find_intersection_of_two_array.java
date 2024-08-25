package array;

import java.util.Scanner;

public class VII_find_intersection_of_two_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter size of 1st array : ");
        int size1 = input.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("enter array elements : ");
        for (int i = 0; i < size1; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.println("enter size of 2nd array : ");
        int size2 = input.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("enter array elements : ");
        for (int i = 0; i < size1; i++) {
            arr2[i] = input.nextInt();
        }
        int intersection = 0;
        for(int i =0 ;i<size1;i++){
            for(int j = 0;j<size2;j++){
                if (arr1[i]==arr2[j]) {
                    intersection = arr1[i];
                    System.out.println("intersection is "+intersection);
                }
            }
        }

    }
}
