package GUI_APPS.GUI_5;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

public class Main {
    public static void main(String[] args) {
       new Main().buildScreen();
    }

    public void buildScreen()
    {
        JFrame window = new JFrame();
        window.setSize(600,600);
        JPanel panel = new JPanel();
        JRadioButton radioButton1 = new JRadioButton("Kilometer");
        JRadioButton radioButton2 = new JRadioButton("Inch");
        JRadioButton radioButton3 = new JRadioButton("feet");
        Converter  c = new Converter(radioButton1);
        radioButton1.addActionListener(c);
        ButtonGroup converters = new ButtonGroup();
        panel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.blue,Color.RED));
            
        converters.add(radioButton1); 
        converters.add(radioButton2); 
        converters.add(radioButton3);
        
        JLabel textInMeters = new JLabel("Enter length in meters");
        JTextField textField = new JTextField(20);
        panel.add(textInMeters);
        panel.add(textField);
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButton3);
        window.add(panel);
        window.setVisible(true);
    }
    class Converter  implements ActionListener {
        JRadioButton button;
       public Converter(JRadioButton button)
       {
            this.button = button;
       }
        @Override
        public void actionPerformed(ActionEvent e) {
               switch (e.getActionCommand()) {
                case "Kilometer":
                JOptionPane.showMessageDialog(null, "Kilometer");
                    
                    break;
                case "Inch":
                JOptionPane.showMessageDialog(null, "Inch");
                 
                    
                    break;
               
                default:
                    break;
               }
        }
    }
    
}
