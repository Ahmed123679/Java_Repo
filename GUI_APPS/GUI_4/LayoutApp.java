package GUI_APPS.GUI_4;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutApp extends JFrame{
    public static void main(String[] args) {
        new LayoutApp();
    }
    public LayoutApp()
    {
        gridLayoutScreen();
        // borderLayoutScreen();
        // flowLayoutScreen();
    }
    public void flowLayoutScreen()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
        for(int i = 0;i<30;i++)
        {
            panel.add(new JButton(i+""));
        }
        add(panel);
        setSize(600,600);
        setVisible(true);
        // setLayout(new FlowLayout());

    }
    public void borderLayoutScreen()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(10,10));
        String[] positions = 
        {BorderLayout.NORTH,BorderLayout.WEST,BorderLayout.EAST,BorderLayout.CENTER,BorderLayout.SOUTH};
        for(String x : positions)
        {
            
            panel.add(new JButton(x),x);
        }
        add(panel);
        setSize(600,600);
        setVisible(true);
    }
    public void gridLayoutScreen()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3, 10, 10));
        panel.setBackground(Color.WHITE);
        for(int i = 0;i<3;i++)
        {
            for(int j = 0;j<3;j++)
            {
                panel.add(new Button(i+","+j));
            }
        }
        add(panel);
        setSize(600,600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE); // exit on close
    }
}
