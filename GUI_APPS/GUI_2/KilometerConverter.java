package GUI_APPS.GUI_2;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;;

public class KilometerConverter extends JFrame{
    private JLabel kilometerLabel;
    private JPanel kilometerPanel;
    private JTextField kilometerTextField;
    private JButton kilometerCalculateButton;
    private JLabel kilometerResult;
    public static void main(String[] args) {
        KilometerConverter obj = new KilometerConverter();
        
        
        // Thread kilometerThread = new Thread(obj::updateResult);
        // kilometerThread.start();
    }
    public KilometerConverter()
    {
        // GUI Components
        this.kilometerCalculateButton = new JButton("Caculate");
        this.kilometerCalculateButton.addActionListener((ActionEvent e)->{
            JOptionPane.showMessageDialog(null,e.getActionCommand() + "");
        });
        this.kilometerCalculateButton.setBackground(Color.RED);
        this.kilometerCalculateButton.setForeground(Color.WHITE);
        this.kilometerLabel = new JLabel("Enter distance in meters");
        this.kilometerTextField = new JTextField(20);
        this.kilometerPanel = new JPanel();
        this.kilometerResult = new JLabel("0K");
        
        // adding components to JPanel
        this.kilometerPanel.add(this.kilometerLabel);
        this.kilometerPanel.add(this.kilometerTextField);
        this.kilometerPanel.add(this.kilometerCalculateButton);
        this.kilometerPanel.add(this.kilometerResult);
        // adding Jpanel to Content Pane -> window = frame
        this.add(this.kilometerPanel);
        this.setSize(400,400);
        this.setVisible(true);

    }
    public void updateResult()
    {
        while (true) 
        {
           try{
            double meteres =  Double.parseDouble(this.kilometerTextField.getText());            
            Double kilometers = meteres/1000;
            this.kilometerResult.setText(Math.round(kilometers) + " K"); 
           }catch(NumberFormatException | NullPointerException e)
           {
            this.kilometerResult.setText("0K"); 

           }
        }
    }
}
