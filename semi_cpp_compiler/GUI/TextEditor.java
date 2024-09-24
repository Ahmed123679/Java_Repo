package semi_cpp_compiler.GUI;

import javax.swing.*;

import javax.swing.JComponent;

public class TextEditor extends JTextArea{
    
    public TextEditor()
    {
        setColumns(100);
        setRows(100);
        this.setEditable(true);
    }
}
