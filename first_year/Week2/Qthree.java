package Week2;
import java.util.*;
public class Qthree {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the ICT marks : ");
        float ictMarks = input.nextFloat();
        System.out.print("Enter the CW marks : ");
        float cwMarks = input.nextFloat();  
        if ((ictMarks >= 30) && (cwMarks >= 30)){
            float final_mark = ((ictMarks + cwMarks) / 2);
            if (final_mark >= 40){
                System.out.println("Module passed\n Marks : " + final_mark);
            }
            else {
                System.out.println("Module failed ");
            }
        }
    }
}