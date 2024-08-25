package array;
import java.util.Scanner;
public class II_find_maximum_in_at_array {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int max = 0;
        int min = 0;
        int maxtwo = 0;
        System.out.println("Enter "+size+" numbers each by entering enter key !!!");
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("the array is : ");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        for(int i=0;i<size;i++){
            min= arr[0];
            if(arr[i]>max){
                maxtwo=max;
                max = arr[i];
            }
            if(arr[i]>maxtwo && arr[i]<max){
                maxtwo = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("the max from array  is : "+max);
        System.out.println("the 2ndmax from array  is : "+maxtwo);
        System.out.println("the min from array  is : "+min);
    }
}
