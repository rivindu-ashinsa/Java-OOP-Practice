import java.util.*;

public class ToCm{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length in Meters (M) : ");
        float lengthInM = input.nextFloat();
        float result = lengthInM * 100;
        System.out.println("Result : " + result + " cm");
    }
}