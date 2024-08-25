import java.util.Scanner;

public class gradecheck {
    
        public static void main(String[] args){
            // if the grade is above 70% then A grade if betwen 60%-70% then b+ , between 45%- 60% grade b , between 35%-45% grade c , less then 35% then fail .
            System.out.println("enter your grade (IN %)");
            Scanner input = new Scanner(System.in);
            int a = input.nextInt();
            
            
            if(a>70 && a<100){
                System.out.println("A grade");
            }
            else if(a>60 && a<70){
                System.out.println("grade b+");
            }
            else if(a>45 && a<60){
                System.out.println("grade b");
            }
            else if(a>35 && a<45){
                System.out.println("grade c");
            }
            else if(a<35){
                System.out.println("fail");
            }
            else{
                System.out.println("invalid grade");
            }
          }
        
}
