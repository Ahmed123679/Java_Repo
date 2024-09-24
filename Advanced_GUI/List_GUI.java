package Advanced_GUI;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.Arrays;


/*
 * List GUI is class demonstrating JList.
 * ListSelectionModel.SINGLE_SELECTION --> one item
 * ListSelectionModel.SINGLE_INTERVAL_SELECTION --> continuous items
 * ListSelectionModel.Multiple_INTERVAL_SELECTION --> discontinuous items
 * 
 */
public class List_GUI extends JFrame{
    private JPanel panel;
    private String[] listOfItems;
    private JTextField selectedItems;
    private JList<String> list;
    public static void main(String[] args) {
        new List_GUI();
    }
    public List_GUI()
    {
        String[] names = {
            "Ahmed","Hassan","Ali",
            "Ahmed","Hassan","Ali",
            "Ahmed","Hassan","Ali",
            "Ahmed","Hassan","Ali",
            "Ahmed","Hassan","Ali"
    
    };
        selectedItems = new JTextField(20);
        this.list = new JList<String>(names);
        list.addListSelectionListener(new ListActionListener());
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setBorder(BorderFactory.createLineBorder(Color.RED));
        list.setVisibleRowCount(2);
        this.panel = new JPanel();
        this.panel.setLayout(new BorderLayout());
        this.panel.add(new JScrollPane(this.list),BorderLayout.NORTH);
        this.panel.add(selectedItems,BorderLayout.SOUTH);
        add(this.panel);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private class ListActionListener implements ListSelectionListener
    {

        @Override
        public void valueChanged(ListSelectionEvent e) {
             listOfItems  = (list.getSelectedValuesList().toArray(new String[0]));   
            selectedItems.setText("selected: " + listOfItems.toString());
        }
        
    }

}
