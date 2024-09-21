package GUI_APPS.GUI_3;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
public class Window extends JFrame {
    private JButton redButton;
    private JButton blueButton;
    private JButton yellowButton; 
    private JPanel panel;
    public Window()
    {
        // initialization
        this.redButton = new JButton("RED");
        this.blueButton = new JButton("BLUE");
        this.yellowButton = new JButton("YELLOW");
       
       // adding action Listeners to button
        redButton.addActionListener(new ChangeColorEvent());
        blueButton.addActionListener(new ChangeColorEvent());
        yellowButton.addActionListener(new ChangeColorEvent());
       
        // creating Jpanel components
        this.panel = new JPanel();
        this.panel.add(redButton);
        this.panel.add(blueButton);
        this.panel.add(yellowButton);
        add(this.panel);
        // adding title
        setTitle("Color Paletter App");
        // setting window size
        setSize(400,500);
        setVisible(true);
    }
    class ChangeColorEvent implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            // getting String wriiten in the button
            String button = e.getActionCommand();
            switch (button) {
                case "RED":
                    panel.setBackground(Color.RED);
                    break;
                case "BLUE":
                    panel.setBackground(Color.BLUE);
                    break;
                case "YELLOW":
                    panel.setBackground(Color.YELLOW);
                default:
                    break;
            }
            // getting reference to the button
            if(e.getSource() == redButton)
            {
                JOptionPane.showMessageDialog(null, "RED Button pressed");
            }else if(e.getSource() == blueButton)
            {
                JOptionPane.showMessageDialog(null, "BLUE Button pressed");
            }else {
                
                JOptionPane.showMessageDialog(null, "Yellow Button pressed");

            }
        }
    }
}
