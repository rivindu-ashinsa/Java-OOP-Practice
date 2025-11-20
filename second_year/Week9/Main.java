package Week9;

public class Main{
    public static void main(String args[]){
        try {
        int[] numbers = {1,2,3,4};
        int result = numbers[6]/0;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("List index out of range");
        }         
        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }                   
    }
}