import java.util.Scanner;
public class IV_find_maxnum_in_array {
	public static void main(String[]args){
	System.out.println("enter the size of array : ");
	Scanner input = new Scanner(System.in);
	int size = input.nextInt();
	int[] arr = new int[size];
	int max = 0;
	int min = 0;
	int secondmax = 0;
	System.out.println("enter "+size+" array elements : ");
	for(int i = 0;i<size;i++){
	arr[i]=input.nextInt();
	}
	System.out.println(" entered array is : ");
	for(int i = 0;i<size;i++){
	System.out.print(""+arr[i]+ " ");
	}
	System.out.println();
	min=arr[0];
	for(int i=0;i<size;i++){
		if(arr[i]>max){
			secondmax = max;
			max=arr[i];
		}
		
		if(arr[i]>secondmax && arr[i]<max){
		secondmax=arr[i];
		}
		if(arr[i]<min){
		min = arr[i];
		}
	}
	System.out.println(" the max from array is : "+max);
	System.out.println(" the 2ndmax from array is : "+secondmax);
	System.out.println(" the min from array is : "+min);
	}
}