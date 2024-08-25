
import java.util.Scanner;
public class V_findmissnumber_in_array{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the size of array : ");
	int size = input.nextInt();
	System.out.println("----------------------------");
	System.out.println("Enter array  elements : ");
	int[] arr = new int[size];	
	for(int i = 0 ; i < size ; i++){
	arr[i]=input.nextInt();
	}
	System.out.println("----------------------------");
	System.out.println("Entered array  elements : ");	
	for(int i = 0 ; i < size ; i++){
	System.out.println(arr[i]);
	}
	int sum = 0; int esum = 0 ; int start = arr[0] ; int end = arr[size-1];
	for(int i = 0 ; i < size ;i++){
	sum = sum+arr[i];
	}
	for(int i = start ; i<=end;i++){
	esum = esum+i;
	}
	int missing_number = esum-sum;
	System.out.println("THE MISSING NUMBER IS : "+missing_number);

	}

}