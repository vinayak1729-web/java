
import java.util.Scanner;
public class III_reverse_number_by_array {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int size = input.nextInt();
        int [] arr= new int[size+1];
        int [] rev =new int[size+1];
        for(int i =1;i<size+1;i++){
            
           if(i==1){
            System.out.println("enter "+(i)+"st number in array :");
           }
           if(i==2){
            System.out.println("enter "+(i)+"nd number in array :");
           }
           if(i==3){
            System.out.println("enter "+(i)+"rd number in array :");
           }
           if(i>3){

            System.out.println("enter "+(i)+"th number in array :");
           }

           arr[i]=input.nextInt();
            
        }
        System.out.println("The entered array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            rev[i]=arr[size-1-i];
    
        }
        System.out.println();
        System.out.println("The revered array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(rev[i] + " ");
        }
        




    }
}
