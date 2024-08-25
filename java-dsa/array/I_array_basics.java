
public class I_array_basics {
    public static void main(String[] args) {
        // array is used to store multiple values in a variable it can be any like
        // String , int , float , bolean , or double .
        // basically normal array is a vector if compare it with maths 
        String[] cars = { "Mercedez 500-E", "BMW M5-CS", "LEXSUS LFA", "","NISSAN SKYLINE GTR", "TOYOTA -SUPRA" };
        cars[3] = "LEXUS ES400";
        
        for(int i = 0 ; i<cars.length;i++){
            System.out.println(cars[i]);
        }
    }

}
