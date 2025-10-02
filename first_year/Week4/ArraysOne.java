package Week4;
import java.util.*;

public class ArraysOne{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] marks = new int[6];
        for (int i = 0; i<=5; i++) {
            System.out.print("Enter mark " + (i+1) + ": ");
            marks[i] = input.nextInt();
            
        }
        for (int i = 0; i<marks.length; i++) {
            System.out.println("Mark " + (i+1) + ": " + marks[i]);
        }
        marks[0] = 100;
        int StudentsFailed = 0;
        for (int i = 0; i<marks.length; i++) {
            if (marks[i] < 40) {
                StudentsFailed++;
            }
        }
        int totalMarks = 0;
        for (int mark : marks){
            totalMarks += mark;
        }
        float averageMarks = totalMarks / marks.length;
        System.out.println("Average marks: " + averageMarks);
        System.out.println("Number of students who failed: " + StudentsFailed);
    }
}