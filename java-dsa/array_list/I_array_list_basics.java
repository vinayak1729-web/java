
import java.util.ArrayList;
public class I_array_list_basics {
    public static void main(String[]args){
       // a arraylist is a resizable means u can resize it any time
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("bmw m5cs");
        cars.add("mercedes 500e");
        cars.add("nissan gtr");
        cars.add("toyota supra");
        cars.set(0,"lexus es400");
        cars.remove(0);
        
        for(int i = 0;i<cars.size();i++){
                System.out.println(cars.get(i));
        }
        cars.clear();

        //2:11:12

    }
}
