public class findhypotensue {
    public static void main(String[] args) {
        Double a = 16.0;
        Double b = 3.890;
        // a and b are 2 sides of triangle , let c be the hypotenuse
        Double c ;

        c = Math.sqrt((Math.pow(a, 2)+Math.pow(b,2)));
        System.out.println(c);
    }
}
