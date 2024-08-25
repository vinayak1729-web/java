import java.util.Scanner;

public class reverse {
   public static void main(String[] arg){
    System.out.println("ENTER THE NUMBER ");
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int temp = a;
    int rev =0 , rem = 0 ;
    while(a>0){
        rem = a%10;
        rev = rev*10+rem;
        a = a/10;

    }
    System.out.println("the reverse of " +temp+ "is "+rev);
   }
}
