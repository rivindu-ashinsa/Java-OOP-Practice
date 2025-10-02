package Week2;

import java.util.Scanner;

public class Qfive{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int fistNumber = input.nextInt();
        System.out.print("Enter second number : ");
        int SecondNumber = input.nextInt();
        System.out.print("Enter the operator (+,-,/,*): ");
        String operator = input.next().trim();
        switch (operator) {
            case "+":
            System.out.println("Result: " + (fistNumber + SecondNumber));
            break;
            case "-":
            System.out.println("Result: " + (fistNumber - SecondNumber));
            break;
            case "*":
            System.out.println("Result: " + (fistNumber * SecondNumber));
            break;
            case "/":
            if (SecondNumber != 0) {
                System.out.println("Result: " + (fistNumber / SecondNumber));
            } else {
                System.out.println("Error: Division by zero");
            }
            break;
            default:
            System.out.println("Invalid operator");
            break;
        }

    }
}