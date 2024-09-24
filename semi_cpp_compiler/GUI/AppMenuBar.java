package semi_cpp_compiler.GUI;

import javax.swing.BorderFactory;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.*;
public class AppMenuBar extends JMenuBar{
   
    // file menu
    private JMenu fileMenu;
    private JMenuItem run;
    private JMenuItem save;
    private JMenuItem exit;
    // Edit menu
    private JMenu editMenu;
    private JMenuItem font;
    private JMenuItem foreGroundColor;
    private JMenuItem BackgroundColor;

    public AppMenuBar()
    {
        this.fileMenu = new JMenu("File");
        // this.fileMenu.setSize(100,20);
        // this.fileMenu.setFont(new Font("Sans-Serif",Font.BOLD,24));
        this.run = new JMenuItem("Run -R");
        this.save = new JMenuItem("Save -S");
        this.exit = new JMenuItem("Exit -E");
        this.fileMenu.add(run);
        this.fileMenu.add(save);
        this.fileMenu.add(exit);
        // edit menu
        this.editMenu = new JMenu("Edit");
        this.font = new JMenuItem("Font");
        this.foreGroundColor = new JMenuItem("Text color");
        this.BackgroundColor = new JMenuItem("background color");
        this.editMenu.add(font);
        this.editMenu.add(foreGroundColor);
        this.editMenu.add(BackgroundColor);
        
        add(fileMenu);
        add(editMenu);
        setBorder(BorderFactory.createLineBorder(Color.GRAY,1));
    }

    public JMenu getFileMenu() {
        return fileMenu;
    }

    public void setFileMenu(JMenu fileMenu) {
        this.fileMenu = fileMenu;
    }

    public JMenuItem getRun() {
        return run;
    }

    public void setRun(JMenuItem run) {
        this.run = run;
    }

    public JMenuItem getSave() {
        return save;
    }

    public void setSave(JMenuItem save) {
        this.save = save;
    }

    public JMenuItem getExit() {
        return exit;
    }

    public void setExit(JMenuItem exit) {
        this.exit = exit;
    }

    public JMenu getEditMenu() {
        return editMenu;
    }

    public void setEditMenu(JMenu editMenu) {
        this.editMenu = editMenu;
    }

    public JMenuItem getFontItem() {
        return font;
    }

    public void setFont(JMenuItem font) {
        this.font = font;
    }

    public JMenuItem getForeGroundColor() {
        return foreGroundColor;
    }

    public void setForeGroundColor(JMenuItem foreGroundColor) {
        this.foreGroundColor = foreGroundColor;
    }

    public JMenuItem getBackgroundColor() {
        return BackgroundColor;
    }

    public void setBackgroundColor(JMenuItem backgroundColor) {
        BackgroundColor = backgroundColor;
    }

}
