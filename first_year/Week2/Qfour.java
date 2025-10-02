package Week2;
import java.util.*;
import java.util.Scanner;
public class Qfour {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the marks : ");
        int mark = input.nextInt();
        if (mark > 100){
            System.out.println("Invalid value");
        }
        else if (mark > 69){
            System.out.println("First class");
        }
        else if( mark > 59){
            System.out.println("Second class (Upper)");
        }
        else if(mark > 49){
            System.out.println("Second class (Lower)");
        }
        else if (mark > 39){
            System.out.println("Thirds class");
        }
        else {
            System.out.println("Invalid value");
        }
    }
}