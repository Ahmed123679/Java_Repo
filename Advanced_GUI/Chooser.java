package Advanced_GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;;
public class Chooser extends JFrame{
    private JFileChooser fChooser;
    private JTextArea content;
    public static void main(String[] args) {
        new Chooser();
    }
    public Chooser()
    {
        JSlider slider = new JSlider(JSlider.VERTICAL,0,50,25);
        JLabel title = new JLabel("Write down your thoughts");
         content = new JTextArea(100,50);
         content.setLineWrap(true);
         content.setFont(new Font("Sans-Serif",Font.BOLD,34));
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
         JScrollPane scrollPane = new JScrollPane(content);
        content.setEditable(true);
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(10,0));
        panel.add(slider,BorderLayout.WEST);
        fChooser = new JFileChooser();
        
        panel.add(title,BorderLayout.NORTH);
        panel.add(scrollPane,BorderLayout.CENTER);
        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(new SaveButtonEvent());
        panel.add(saveButton,BorderLayout.SOUTH);
        add(panel);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    private class SaveButtonEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int status = fChooser.showSaveDialog(null);
            if(status == JFileChooser.APPROVE_OPTION)
            {
               File file =  fChooser.getSelectedFile();
               try
               {
                   PrintWriter fout = new PrintWriter(file);
                   fout.write(content.getText());
                   fout.close();
                   
                }catch(FileNotFoundException ex)
                {
                   // fChooser.(null, "Unable to save the file");
                }
                JOptionPane.showMessageDialog(null, "Your file "+ file.getAbsolutePath() + " is saved" );

            }
        }

    }
}