import java.util.*;
public class WageBill {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many manual people : ");
        float manualCount = input.nextFloat();
        System.out.print("How many skilled people : ");
        float skilledCount = input.nextFloat();
        System.out.print("How many management people : ");
        float managementCount = input.nextFloat();
        float manual_bill = manualCount * 500;
        float skilled_bill = skilledCount * 700;
        float management_bll = managementCount * 800;
        float total_bill = manual_bill + skilled_bill + management_bll;
        double taxToPay = total_bill * 0.2;
        System.out.println("Total wage : " + total_bill);
        System.out.println("Tax to pay : " + taxToPay);

    }
}
