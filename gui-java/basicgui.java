//for gui use this import file like javax.swing.jOptionPane

import javax.swing.JOptionPane;

public class basicgui {
    public static void main(String[] args) {
        // to ask input in java in gui , use following command
        String name = JOptionPane.showInputDialog("Enter your name ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age "));
        float height = Float.parseFloat(JOptionPane.showInputDialog("Enter your height "));

        // to show the input use this :
        JOptionPane.showMessageDialog(null,
                "hello " + name + " you are " + age + " years old and also have a good height of " + height, name, 0,
                null);
    }
}
