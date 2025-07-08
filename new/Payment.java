

public class Payment {
    private String email;
    private double PayementAmount;

    public Payment(String email, double PaymentAmount){
        this.email = email;
        this.PayementAmount = PaymentAmount;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public void setPaymentAmount(double PaymentAmount){
        this.PayementAmount = PaymentAmount;
    }

    public void printPaymentAmount(){
        System.out.println(email + " has paid " + PayementAmount + " for the ticket.");
    }
    
}
