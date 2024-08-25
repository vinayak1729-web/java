import java.util.Scanner;

class DiscountOverCost {
    float dis;

    void costprice(String verify, double cp) {
        if (verify.equals("yes")) {
            if (cp > 500) {
                dis = (float) (0.1 * cp);
                cp = cp - dis;
                System.out.println("Discounted price is: " + cp);
            } else {
                dis = (float) (0.05 * cp);
                cp = cp - dis;
                System.out.println("Discounted price is: " + cp);
            }
        } else if (verify.equals("no")) {
            if (cp > 500) {
                dis = (float) (0.08 * cp);
                cp = cp - dis;
                System.out.println("Discounted price is: " + cp);
            } else {
                dis = (float) (0.02 * cp);
                cp = cp - dis;
                System.out.println("Discounted price is: " + cp);
            }
        }
    }
}

public class discount3 {
    /*
     * WAP to accept Cost Price from user and ask whether the user is a student or
     * not. If the user is a student
     * and cost price is greater than 500, give a discount of 10% ELSE discount will
     * be 5%. If the user is not a student
     * and the cost price is greater than 500, give a discount of 8% ELSE discount will be 2%.
     * (Take all inputs from USER)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Cost Price:");
        float cp = input.nextFloat();
        input.nextLine(); // Consume the newline character left by nextFloat()

        System.out.println("Are you a student? (yes/no):");
        String verify = input.nextLine().toLowerCase();

        if (verify.equals("yes") || verify.equals("no")) {
            DiscountOverCost costp = new DiscountOverCost();
            costp.costprice(verify, cp);
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
        }

        input.close();
    }
}
