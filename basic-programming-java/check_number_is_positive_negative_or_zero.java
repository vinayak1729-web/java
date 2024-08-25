import java.util.Scanner;

public class check_number_is_positive_negative_or_zero {
    public static void main(String[] args){
        while (true) {
            System.out.println("ENTER A NUMBER");
            Scanner input = new Scanner(System.in);
            int a = input.nextInt();
            if (a>0) {
                System.out.println (a+ " IS POSITIVE NUMBER");
            }
            else if(a==0){
                System.out.println(a+" IS ZERO ");
            }
            else{
                System.out.println(a+ " IS  NEGITVE NUMBER ");
            }
            
        }
    }
}
