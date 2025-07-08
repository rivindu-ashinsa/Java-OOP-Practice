import java.util.Scanner;

public class Initials {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first name : ");
        String fName = input.nextLine();
        String nameFirstLetter = (fName.substring(0,1));
        System.out.println("Enter the second name : ");
        String lName = input.nextLine();
        String nameSecLetter = (lName.substring(0,1));
        System.out.print(nameFirstLetter);
        System.out.print(nameSecLetter);
    }
}   
