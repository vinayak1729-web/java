import java.util.Scanner;

// if number is divided ny 2 then it is even , it can be find by checking its modules i.e reminder which must be 0 in order to be even number .

public class  even_odd1 {
    public static void main(String[] args) {
        System.out.println("enter number to check it is even or odd!");
        System.out.println();
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        while(true){
            if(number%2==0){
                System.out.println(number+" is even");
            }
            else{
                System.out.println(number+" it is odd ");
            }

        }
        
    }
}
