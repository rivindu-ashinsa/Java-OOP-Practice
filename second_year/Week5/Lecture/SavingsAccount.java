package Week5.Lecture;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(){

    }
    @Override
    void calculateInterestOrFees(){
        System.out.println("calculating interest and fees");
    }
}
