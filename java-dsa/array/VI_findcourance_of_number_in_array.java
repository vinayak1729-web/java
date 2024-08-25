package array;

import java.util.Scanner;

public class VI_findcourance_of_number_in_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = input.nextInt();
        System.out.println("----------------------------");
        System.out.println("Enter array  elements : ");
        int[] arr = new int[size];
        boolean[] visited = new boolean[size];	
        for(int i = 0 ; i < size ; i++){
        arr[i]=input.nextInt();
        visited[i]=false;
        }
        for(int i = 0 ; i < size ; i++){
            if (!visited[i]) {
                int count = 1;
                for (int j = i+1; j < size; j++) {
                    if (arr[i]==arr[j]) {
                     count++;
                     visited[i]=true;
                    }
                }
                System.out.println(" occurance of  "+arr[i]+" is : "+count);
            }
        }
    }
}
