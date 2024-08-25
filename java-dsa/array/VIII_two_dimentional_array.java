
public class VIII_two_dimentional_array {
    public static void main(String[] args) {
        // a two dimentional array is like a matrix which have rows and colums
        String[][] cars = { 
            {"NISSAN SKYLINE GTR", "LEXUS ES400","TOYOTA-SUPRA"},
            {"MERCEDES 500-E","BMW-M5CS","PORSHE 911 GT3"},
            {"FORD MUSTANG","CHEVY IMPALA","DODE VIPER"},
            {"FERRARI F40","LAMBORGHINI AVANDATOR"}
        };
        for(int i = 0 ; i<cars.length;i++){
            System.out.println();
            for(int j = 0;j<cars[i].length;j++){
                System.out.println(cars[i][j]);
            }
        }
    }
}
