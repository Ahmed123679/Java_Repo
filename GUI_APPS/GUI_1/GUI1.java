package GUI_APPS.GUI_1;
import javax.swing.*;
public class GUI1 {
    public static void main(String[] args) {
            final int WINDOW_WIDTH = 400;     
            final int WINDOW_HEIGHT = 400; 
            JFrame window = new JFrame();
            
            window.setTitle("First GUI APP");
            window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setVisible(true);
    }
}
