package Advanced_GUI;
import javax.swing.*;
public class Combo extends JFrame{
    public static void main(String[] args) {
        new Combo();
    }

    public Combo()
    {
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        String months[] = {
            "JAN","FEB","MAR","APR","JUN","JUL","AUG","SEP","NOV","DEC"
        };
        JComboBox<String> box = new JComboBox<String>(months);
        box.setEditable(true);
        JPanel panel = new JPanel();
        panel.add(box);
        add(panel);

        
        setVisible(true);
    }
}
