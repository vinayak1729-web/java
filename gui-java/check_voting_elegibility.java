import javax.swing.JOptionPane;
public class  check_voting_elegibility{
    public static void main(String[]args){
        String name = JOptionPane.showInputDialog(null,"Enter your name :");
       
        int  age = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your age :"));
        if(age<18){
            JOptionPane.showMessageDialog(null,"SORRY "+name+" ARE UNDER AGE LESS THEN 18 YOU CAN VOTE AFTER "+(18-age)+" YEARS");
        }
        else{
            JOptionPane.showMessageDialog(null,name+" YOU ARE ELIGEBLE FOR VOTING SINCE "+(age-18)+" YEARS");
        }
}
}