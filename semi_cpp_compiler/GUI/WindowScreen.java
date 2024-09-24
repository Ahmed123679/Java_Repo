package semi_cpp_compiler.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class WindowScreen extends JFrame{
    private File file;
    private JPanel panel;
    private TextEditor codePane;
    public WindowScreen()
    {
        codePane = new TextEditor();
        var appMenuBar = new AppMenuBar();
        appMenuBar.getRun().addActionListener(new RunEvent());
        appMenuBar.getSave().addActionListener(new SaveEvent());
        appMenuBar.getExit().addActionListener(new ExitEvent());
        appMenuBar.getForeGroundColor().addActionListener(new ForeGroundColorEvent());
        appMenuBar.getBackgroundColor().addActionListener(new BackGroundColorEvent());
        appMenuBar.getFontItem().addActionListener(new FontSizeEvent());
        this.panel = new JPanel();
        this.panel.setLayout(new BorderLayout());
        // this.panel.add(new AppMenuBar(),BorderLayout.NORTH);
        this.panel.add(codePane,BorderLayout.CENTER);
        add(panel);
        
        setJMenuBar(appMenuBar);
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    private class RunEvent implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(file != null)
            {
                ProcessBuilder run = new ProcessBuilder();
                run.command("cmd.exe","/c","start " + file.getAbsolutePath().substring(0, file.getAbsolutePath().length()-4)+".exe");
               ProcessBuilder process =  new ProcessBuilder();
               process.command("cmd.exe","/c","g++ " + file.getAbsolutePath() + " -o " + file.getAbsolutePath().substring(0, file.getAbsolutePath().length()-4)+".exe");
              try {
                        Process p = process.start();
                     BufferedReader reader = new BufferedReader(new InputStreamReader(p.getErrorStream()));
                    String output;
                    String fullOutput = "";
                  while((output = reader.readLine())!= null)
                  {
                    fullOutput += output;
                  }
                  JOptionPane.showMessageDialog(null, fullOutput);
                  int exitCode = p.waitFor();
                  var p2 = run.start();
                  reader = new BufferedReader(new InputStreamReader(p2.getErrorStream()));
                  while((output = reader.readLine())!= null)
                  {
                      fullOutput += output;
                  }
                    int exit2 = p2.waitFor();
                  JOptionPane.showMessageDialog(null,fullOutput);
                }
                catch(IOException | InterruptedException ex)
                {
                    JOptionPane.showMessageDialog(null, "Interruptted");
                }
            }else {
               JFileChooser fChooser = new JFileChooser();
               int status =  fChooser.showSaveDialog(null);
                if(status == JFileChooser.APPROVE_OPTION)
                {   
                    file = fChooser.getSelectedFile();
                    try {

                        PrintWriter fout = new PrintWriter(file);
                        fout.write(codePane.getText());
                        fout.close();
                    }catch(FileNotFoundException exc)
                    {
                        JOptionPane.showMessageDialog(null,"File not found");
                    }
                    JOptionPane.showMessageDialog(null,file.getAbsolutePath());
                }else if(status == JFileChooser.CANCEL_OPTION) {
                    JOptionPane.showMessageDialog(null,"you must save the file before running");
                }else {
                    JOptionPane.showMessageDialog(null,"Error");
       
                }
            }
        }
    }
    private class SaveEvent implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(file != null)
            {
                try
                {
                    PrintWriter printWriter = new PrintWriter(file);
                    printWriter.write(codePane.getText());
                    printWriter.close();
                    JOptionPane.showMessageDialog(null, "file is already Saved");

                }catch(IOException ex)
                {
                    JOptionPane.showMessageDialog(null, "Error saving file");
                }
            }else {
                JFileChooser fChooser = new JFileChooser();
               int status =  fChooser.showSaveDialog(null);
                if(status == JFileChooser.APPROVE_OPTION)
                {   
                    file = fChooser.getSelectedFile();
                    try {

                        PrintWriter fout = new PrintWriter(file);
                        fout.write(codePane.getText());
                        fout.close();
                    }catch(FileNotFoundException exc)
                    {
                        JOptionPane.showMessageDialog(null,"File not found");
                    }
                    JOptionPane.showMessageDialog(null,file.getAbsolutePath());
                }else if(status == JFileChooser.CANCEL_OPTION) {
                    JOptionPane.showMessageDialog(null,"you must save the file before running");
                }else {
                    JOptionPane.showMessageDialog(null,"Error");
       
                }
            }
        }
    }
    private class ExitEvent implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        dispose();
        }
    }
    private class FontSizeEvent implements ActionListener {
        private JDialog fontDialog = new JDialog();
        private JSlider fontSizeSlider = new JSlider(JSlider.HORIZONTAL,11,72,11);

        
        @Override
        public void actionPerformed(ActionEvent e) {
            fontSizeSlider.setMajorTickSpacing(11);
            fontSizeSlider.setMinorTickSpacing(1);
            fontSizeSlider.setPaintTicks(true);
            fontSizeSlider.setPaintLabels(true);

            fontSizeSlider.addChangeListener(new SliderEvent());
            fontDialog.add(fontSizeSlider);
            fontDialog.setSize(100,100);
            fontDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            fontDialog.setVisible(true);
        }
        private class SliderEvent implements ChangeListener {

            @Override
            public void stateChanged(ChangeEvent e) {
                codePane.setFont(new Font("Monospace",Font.BOLD,fontSizeSlider.getValue()));                
            }
            
        }
    }
    private class ForeGroundColorEvent implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
           
            try{

               Color color =  JColorChooser.showDialog(null, "pick Color", Color.WHITE);
               codePane.setForeground(color);
            }catch(HeadlessException ex)
            {

            }
        }
    }
    private class BackGroundColorEvent implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
           
            try{

               Color color =  JColorChooser.showDialog(null, "pick Color", Color.WHITE);
               codePane.setBackground(color);
            }catch(HeadlessException ex)
            {

            }
        }
    }
}
