public class use_of_math_function {
    public static void main(String[]args){
        int a= 10; int b = 30;
        // this operation founds the minimum of the entered number 
        Math.min(a,b);
         // this operation founds the maximum of the entered number 
        Math.max(a, b);
        Double x = 3.142;
        Double y = -10.8;
        // lets check which is maximum from x and y
        Double z = Math.max(x, y);
        // to find modulus use abs function from Math
        Double m = Math.abs(y); 
        // to find Square root of any number 
        Double v = Math.sqrt(x); 
        // to find power of any number 
        Double p = Math.pow(x,y); 
        System.out.println(p);

    }
}
