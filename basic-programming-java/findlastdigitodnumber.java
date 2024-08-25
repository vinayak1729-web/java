import java.util.Scanner;

public class findlastdigitodnumber {
    public static void main(String [] args){
        System.out.println("enter number");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        a= a%10;
        
        System.out.println(a);
    

    }
}
