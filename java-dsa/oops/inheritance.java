class engine {
    void engine_info(){
        System.out.println(" 2jz twin turbo inline 6 cylinder rataatataararata !!!!!!!");
    }
}

class chesi extends engine {
    void  chesi_info(){
        System.out.println(" a titanum builded chesi ");
    }
}
class  tire extends chesi{
    void tire_info(){
        System.out.println("17 inch titanum wheels ");
    }
}
class body extends tire{
    void body_info(){
        System.out.println(" a carbon fiber body , to strong ");
    }
}

class supraa extends body{
    void supra_info(){
        System.out.println(" its supra mk4 ");
    }
}

public class inheritance {
    public static void main(String[] args) {
        supraa supra = new supraa();
        supra.supra_info();
        supra.body_info();
        supra.chesi_info();
        supra.tire_info();
        supra.engine_info();
    }
}
