package threads;
import javax.swing.*;
import java.util.*;
public class Main extends JFrame{
    private JPanel panel;
    private JLabel timeLabel;
    private Date timeNow;
    public JLabel getTimeLabel() {
        return timeLabel;
    }
    public void setTimeLabel(JLabel timeLabel) {
        this.timeLabel.setText(timeLabel.getText());
    }

    public Date getTimeNow() {
        return timeNow;
    }
    public void setTimeNow(Date timeNow) {
        this.timeNow = timeNow;
    }
    public static void main(String[] args) {
        Main mainObject = new Main();
        mainObject.GUI_Create();
        // creating thread by passing runnable object
        Thread myThread = new Thread(new Task(mainObject));
        // adding thread to thread pool == ready state
        myThread.start();
    }
    void GUI_Create()
    {
        this.timeNow = new Date();
        this.panel = new JPanel();
        this.timeLabel = new JLabel(timeNow.toString());
        panel.add(timeLabel);
        add(this.panel);
        setBounds(EXIT_ON_CLOSE, ABORT, 300, 300);
        setVisible(true);
    }
}

// create class extends Runnable to create a thread task
class Task implements Runnable {
    private Main obj;
    public Task(Main obj)
    {
        this.obj = obj;
    }
    @Override
    public void run() {
       
    while(true)
    { 
        System.out.println("Thread is running");
        obj.setTimeLabel(new JLabel(new Date().toString()));
        try {

            Thread.sleep(1000);;
        }catch(InterruptedException e)
        {
            obj.setTimeLabel(new JLabel(e.getMessage().toString())); 
        }
    }
    }
    
}