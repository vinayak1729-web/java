import java.util.Scanner;

public class add_to_digits_of_number_ {
    public static void main(String[] args) {
        int rem = 0, res = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER");
        int a = input.nextInt();
        res = a;
        int sum=0;
       while (res!=0) {
         rem = res % 10;
         sum = sum + rem;
         res = res/10;
       }
        
        System.out.println("sum of digits of number  "+a +"  is : "+sum);
    }
}
