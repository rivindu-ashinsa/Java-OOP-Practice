package Week2;
import java.util.*;
public class Qeight {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the game!\n0. Rock\n1. Paper\n2. Scissors");
        System.out.print("Enter a number between 0 and 2: ");
        int userNumber = input.nextInt();
        int randomNumber = new Random().nextInt(3);       
        System.out.println(randomNumber);
        if (userNumber == randomNumber){
            System.out.println("It's a tie!");
        }
        else if (userNumber == 0 && randomNumber == 2 || userNumber == 1 && randomNumber == 0 || userNumber == 2 && randomNumber == 1){
            System.out.println("You win!");
        }
        else{
            System.out.println("You lose!");
        }
    }
}