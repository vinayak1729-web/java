package array;

import java.util.Scanner;

public class V_find_missing_from_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int size = input.nextInt();
        int[] arr=new int[size];
        System.out.println("enter "+size+" array elements");
        for(int i = 0 ; i<size;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("enter array elements : ");
        for(int i = 0 ; i<size;i++){
            System.out.println(arr[i]);
        }
        int sum = 0;
        int esum = 0;
        int start = arr[0];
        int end = arr[size-1];
        for(int i = 0;i<size;i++){
            sum = sum+arr[i];
        }
        for(int i = start;i<=end;i++){
            esum=esum+i;
        }
        int missingnum = esum-sum;
        System.out.println("missing number is "+missingnum);
        
    }
}
