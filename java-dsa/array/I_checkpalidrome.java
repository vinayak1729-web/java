import java.util.Scanner;

class IV_checkpalidrome {
     public static void main(String[] args) {
        System.out.println("enter a string");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String rev = "";
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            rev += chars[i];
        }
        if (str.equals(rev)) {
            System.out.println("The string \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("The reverse of the string is: " + rev);
            System.out.println("The string \"" + str + "\" is not a palindrome.");
        }
    }

}