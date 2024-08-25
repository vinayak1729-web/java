// learn about object class constructor
class car {
    String vehicle_onwer_name;
    String vehicle_number;
    boolean insurance;
   
    public void getInfo() {
        System.out.println("The name of onwer is " + this.vehicle_onwer_name);
        System.out.println("vehicle number " + this.vehicle_number);
        
        if (insurance) {
            System.out.println("Insurance status: Insured");
        } else {
            System.out.println("Insurance status: Not Insured");
            System.out.println("Please pay the insurance.");
        }
    }
    // car(){
    //     // calling a non parameterized constuctor 
    //     System.out.println(" non parameterized contructor called ");
    // }


    // parameterized contructor 
    // car(String vehicle_onwer_name , String vehicle_number, boolean insurance){
    //     this.vehicle_onwer_name=vehicle_onwer_name;
    //     this.vehicle_number=vehicle_number;
    //     this.insurance=insurance;
    // }


    // for copy constructor
    // car(car landcruiser){
    //     this.vehicle_onwer_name=landcruiser.vehicle_onwer_name;
    //     this.vehicle_number=landcruiser.vehicle_number;
    //     this.insurance=landcruiser.insurance;
    // }
    // car(){

    // }
 }
 
 
 public class class_object {
    public static void main(String args[]) {
       
        car rangerover= new car();
        rangerover.vehicle_onwer_name = "Nihar raju shinde";
        rangerover.vehicle_number = "MH03BZ1739";
        rangerover.insurance=true;
         rangerover.getInfo();


        // for non paramertized , only make a simple car(){} in the class car and run any thing in that

        // for paramertarized contructor 
        // car landcruiser = new car("Vinayak raju shinde","MH03AZ4554",false);
        // // landcruiser.vehicle_onwer_name = "Vinayak raju shinde";
        // // landcruiser.vehicle_number = "MH03AZ4554";
        // // landcruiser.insurance=false;
        // landcruiser.getInfo();
 
        // copy contructor , 
        // in this constructor ,  the one contructor is coppied to another 
        
        // car landcruiser = new car(rangerover);
        // landcruiser.getInfo();


    }
 }
 