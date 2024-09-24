package Advanced_GUI;
import javax.swing.*;
public class GUI1 extends JFrame{
    public static void main(String[] args) {
        var screen = new GUI1();
        JPanel panel = new JPanel();
        panel.add(screen.readOnlyTextField());
        screen.add(panel);
        screen.setSize(400,400);
        screen.setVisible(true);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    JComponent readOnlyTextField()
    {
        var textField = new JTextField("uneditable",10);
        // textField.setCursor();
        textField.setEditable(false); // make it read-only
        return textField; 
    }
}
