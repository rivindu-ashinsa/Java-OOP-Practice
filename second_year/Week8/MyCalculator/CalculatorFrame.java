package Week8.MyCalculator;

import java.awt.*;
import javax.swing.*;


public class CalculatorFrame extends  JFrame{
    public CalculatorFrame(){
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4,3));
        for (int i = 1; i <= 9; i++){
            JButton number = new JButton(Integer.toString(i));
            p1.add(number);
        }

        JButton zero = new JButton("0");
        p1.add(zero);

        JButton dot = new JButton(".");
        p1.add(dot);

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(4,1));

        JButton plus = new JButton("+");
        p2.add(plus);

        JButton minus = new JButton("-");
        p2.add(minus);

        JButton clear = new JButton("clear");
        p2.add(clear);

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(1,2));   

        p3.add(p1);
        p3.add(p2);
         
        JTextField textfield = new JTextField();
        this.setLayout(new BorderLayout());
        this.add(textfield, BorderLayout.NORTH);
        this.add(p3, BorderLayout.CENTER);
        
    }
    public static void main(String args[]){
        CalculatorFrame calcFrame = new CalculatorFrame();
        calcFrame.setSize(600,300);
        calcFrame.setVisible(true);
        calcFrame.setTitle("My Calculator");    
        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
