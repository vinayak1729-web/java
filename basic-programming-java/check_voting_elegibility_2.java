import java.util.Scanner;

// if the age is less then or equal to 18 then person is not elegible for voting .

public class check_voting_elegibility_2 {
    public static void main(String []args){
        System.out.println("enter your age");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if(age<18){
            System.out.println("YOU ARE NOT ELEGIBLE FOR VOTTING");
        }
        else{
            System.out.println("YES YOU ARE ELIGIBLE FOR VOTING");
        }
    }
}
