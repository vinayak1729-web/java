

public class String_methods {
    public static void main (String[]args){
        String name = "Bro";
        
        // .equalsIgnoreCase(enter a string) use to ignore the lower or upper case of a string , always give answer in boolean
        Boolean verify=name.equalsIgnoreCase("bRO");
        System.out.println(verify);
        //returns value in boolean

        // use of .length() methed gives the length of the string 
        System.out.println(name.length());
        // returns value in int 

        //use of concatation , by .CharAt()
        System.out.println(name.charAt(2));
        //returns value in character

        // .indexOf() this method is used to find the index numbers of a string by the characters 
        System.out.println(name.indexOf("B"));
        //returns value in int

        // .isEmpty() used to check the string is empty or not
        System.out.println(name.isEmpty());
        // returns value in boolean

        // .toLowerCase() and toUpperCase() used to convert the string in lower or upper case
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        // returns value in string by changing it into lower or upper case

        // trim() it is used  to trim the  space in the string
        System.out.println(name.trim());
        //return String value after triming

        // replace function it replaces the a character of string to another character 
        System.out.println(name.replace("B", "b"));
        // returns String value after replacing 
        
    }
}
