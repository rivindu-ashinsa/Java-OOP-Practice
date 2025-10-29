package Week5.Lecture2;
import java.util.Scanner; 
public class Main {
    public static void main(String args[]){
        int[] numbers = {1,2,3,4,5};

        String[] words = new String[10];
        System.out.println(words[0]);
        Fan[] fans = new Fan[3];
        for (int i = 0 ; i <= 2 ;  i++){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter fan name : ");
            String name = input.next();
            System.out.print("Enter fan price : "); 
            int price = input.nextInt();
            input.close();
            Fan fan1 = new Fan(name);
            fans[i] = fan1;     
        }
        System.out.println(fans[0]);
    }
}
