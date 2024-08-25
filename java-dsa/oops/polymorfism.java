
class find_area {
    int get_area(int a, int b) {
        int c;
        c = (a * b);
        return c;
    }

    double get_area(double a, double b) {
        double c;
        c = (a * b);
        return c;
    }
}

public class polymorfism {
    public static void main(String[] args) {
        find_area area = new find_area();
        System.out.println(area.get_area(10, 12));;
        System.out.println(area.get_area(21.12, 5.932));;
    }
}
