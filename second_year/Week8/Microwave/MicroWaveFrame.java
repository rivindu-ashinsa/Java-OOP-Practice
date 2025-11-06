package Week8.Microwave;
import javax.swing.*;
import java.awt.*;


public class MicroWaveFrame  extends JFrame{
    public MicroWaveFrame(){
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4,3));

        for (int i = 1; i <= 9; i++){
            p1.add(new Button("" + i));

        }

        p1.add(new Button("+"));
        this.add(p1);
        
    }
    public static void main(String args[]){
        MicroWaveFrame frame = new MicroWaveFrame();
        frame.setSize(800,1000);
        frame.setVisible(true);
        frame.setTitle("Microwave");    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

