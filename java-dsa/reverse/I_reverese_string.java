import java.util.Scanner;

public class I_reverese_string {
    public static void main(String[] args) {
        System.out.println("enter a string");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String rev = " ";
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            rev += chars[i];
        }
        System.out.println("reversed string is : " + rev);
    }
}
