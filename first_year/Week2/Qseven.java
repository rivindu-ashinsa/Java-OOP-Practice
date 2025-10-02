package Week2;
import java.util.*;

public class Qseven {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the current account balance : ");
        float currentAccountBalance = input.nextFloat() ;
        while (true) {
            System.out.println("Choose an option: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check for fraud");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            switch (choice) {
            case 1:
                System.out.print("Enter deposit amount: ");
                float depositAmount = input.nextFloat();
                currentAccountBalance += depositAmount;
                System.out.println("New balance: " + currentAccountBalance);
                break;
            case 2:
                System.out.print("Enter withdrawal amount: ");
                float withdrawalAmount = input.nextFloat();
                if (withdrawalAmount > currentAccountBalance) {
                System.out.println("Insufficient funds!");
                } else {
                currentAccountBalance -= withdrawalAmount;
                System.out.println("New balance: " + currentAccountBalance);
                }
                break;
            case 3:
                if (currentAccountBalance < 0) {
                System.out.println("Fraud detected! Negative balance.");
                } else {
                System.out.println("No fraud detected.");
                }
                break;
            case 4:
                System.out.println("Exiting...");
                input.close();
                System.exit(0);
            default:
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
}