import java.util.*;

public class ToFaren {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Celcius : ");
        float tempInCel = input.nextFloat();
        float tempInFar = ((9/5) * tempInCel) + 32;
        System.out.println("Temperature in Ferenheit : " + tempInFar);
    }
}
