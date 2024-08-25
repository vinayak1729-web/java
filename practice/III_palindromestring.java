import java.util.Scanner;

public class III_palindromestring {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a string : ");
	String strr = input.nextLine();
	String realstrr = strr;
	String rev = "";
	char[] charstrr = strr.toCharArray();
	for(int i =charstrr.length-1;i>=0;i--){
		rev+=charstrr[i];
	}
	if(rev.equals(realstrr)){
	System.out.println("THE STRING "+realstrr+" is a palindrome as it's reverse "+rev+" is also equal " ); 
                      }
	else{
	System.out.println("THE STRING "+realstrr+" is not a palindrome as it's reverse "+rev+" is not equal " ); 
	}
 	}
}
