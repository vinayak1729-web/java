import java.util.Scanner;
public class I_reversestring {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter a string");
		String strr = input.nextLine();
		char[] chararray =strr.toCharArray();
		String rev = " " ;
		for(int i =chararray.length-1 ; i>=0;i--)
	                    {
		      rev += chararray[i];
		     }
		System.out.println(" The Reveresed String of "+strr+" is : "+rev);
	}
}    	