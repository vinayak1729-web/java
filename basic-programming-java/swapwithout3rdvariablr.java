import java.util.Scanner;

public class swapwithout3rdvariablr {

    public static void main(String[] args) {
        System.out.println("enter 1st number");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("enter 2nd number");
        int b = input.nextInt();

        System.out.println(" before swap " + a + " and " + b);
        // Swap the values using arithmetic operations
        a = a + b; // Step 1: a now holds the sum of a and b  ---> 5+3 = 8
        b = a - b; // Step 2: b now holds the original value of a------> 8-3 = 5
        a = a - b; // Step 3: a now holds the original value of b--->8-5 = 3
        System.out.println(" after swap " + a + " and " + b);
    }
}
