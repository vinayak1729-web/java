import java.util.Scanner;

public class swapwit3rdvariable {
    public static void main(String[] args){
        System.out.println("enter 1st number");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("enter 2nd number");
        int b = input.nextInt();
        int temp ;
        System.out.println(" before swap "+a+ " and " +b);
        temp = a;
        a = b;
        b = temp;
        System.out.println(" after swap "+a+ " and " +b);
    }
}
