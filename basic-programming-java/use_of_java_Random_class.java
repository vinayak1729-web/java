import java.util.Random;
public class use_of_java_Random_class {
    public static void main(String[] args) {
        // lets find probabilty of a dice of getting 6
        Random random = new Random();
        int count=0;
        int dice =0;
        for(int i =0;i<6;i++){
             dice = random.nextInt(6)+1;
            if(dice==6){
                count=count+1;
            }
            System.out.println(dice);
        }
        System.out.println("probabilty was by random function was :" +count+"/6" );
        System.out.println("probablity by formula is  1/6");
    }
}
