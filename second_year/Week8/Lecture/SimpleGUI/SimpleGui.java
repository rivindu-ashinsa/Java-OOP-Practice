package Week8.Lecture.SimpleGUI;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;   

public class SimpleGui extends JFrame{
    public SimpleGui(){
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(2,2));
        for (int i = 0; i <= 3; i++){
            JButton button = new JButton("" + i + "th Button");
            panel1.add(button); 
        }
        
        JPanel panel2 = new JPanel(); 
        panel2.setLayout(new BorderLayout()); 
        JButton border_button = new JButton("Inside border Layout");
        panel2.add(border_button, BorderLayout.NORTH);

        this.setLayout(new GridLayout(1,2));
        this.add(panel1);
        this.add(panel2);
    }
    public static void main(String[] args) {
        SimpleGui frame = new SimpleGui();
        frame.setTitle(("Simple GUI"));
        frame.setSize(500,300); 
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
