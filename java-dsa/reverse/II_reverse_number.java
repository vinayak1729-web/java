import java.util.Scanner;

public class II_reverse_number {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();
        int realnum = num;
        int rev = 0;
        int digit = 0 ;
        while(num!=0){
            digit = num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        System.out.println("the reversed number of "+realnum+" is : "+rev);
    }
}
