import java.util.Scanner;
import javax.swing.JOptionPane;
import java.math.*;
public class First {
    static void main(String args[])
    {
        // primitive datatypes
        /*
         * numeric datatypes => byte short int long float double
         * boolean => bool
         * character => char 2 bytes unicode
         */
        //  byte l = 2,y = 3;
        //  short m = l+y;
        //  double x = Math.pow(2,3);
        // System.out.println(x);
        // final int me;
        // me = 10;
        // System.out.println("me = " + me);
        int hours = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your working hours"));
        BigDecimal bd = new BigDecimal(hours*12.37);
        bd = bd.setScale(2,RoundingMode.HALF_UP);
        float x = bd.floatValue();
        JOptionPane.showMessageDialog(null,"Your Salary is " + x);
        Scanner keyboard = new Scanner(System.in);
        // System.out.println("Enter your name");
        // String name = keyboard.nextLine();
        // System.out.println("Enter your age");
        // int age = keyboard.nextInt();
        // System.out.println(
            //     "your name is " +  name
            //     + "\n your age is "+ age
        // );

    }
}