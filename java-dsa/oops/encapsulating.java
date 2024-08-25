

class data {
    public String Name;
    protected String email;
    private String password;

    // we cant access the private key word so to acces it , we can use getters and setters ,
    
    // getters 
    public String get_password(){
        return this.password;
    }

    // setters 

    void set_password(String pass){
        this.password= pass;
    }

   
}

public class encapsulating {
    public static void main(String[] args) {
        data Data = new data();
        Data.Name="Vinayak";
        Data.email="Vinayak@1729.com";
        Data.set_password("Vinayak@1729");
        System.out.println(Data.get_password());


    }
}
