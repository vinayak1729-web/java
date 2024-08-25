public class expression {
  public static void main(String[]args){
    // expressions  = operators & operators 
    // operands = values , variables , numbers , quantity 
    // operators = + - * / %

    int student = 10 ; 
    double fees =(double) (student*94000);
    student--;
    System.out.println("will return a decremented result eg , 10 would be 9 : "+student);
    // we can use it in loops like to reduce the variable from each iteration 
    // loops like for , while , do-while , etc loops 
    // example 
    for(student=10;student>=0;student--){
        System.out.println(student);
    }
    // to convert from a datatype to another datatype 
    //example double fees =(double) (student*94000);

    System.out.println(fees);
  }  
}
