class Payment{
    protected double amount;
    public Payment(double amount){
        this.amount = amount;
    }
    public void processPayment(){
        System.out.println("Processing generic payment");
    }
}

class CreditCardPayment extends Payment{
    public CreditCardPayment(double amount){
        super(amount);
    }
    @Override
    public void processPayment(){
        System.out.println("Processing Credit Card Payment of Rs."+amount);
    }
}

class UPIPayment extends Payment{
    public UPIPayment(double amount){
        super(amount);
    }
    @Override
    public void processPayment(){
        System.out.println("Processing UPI Payment of Rs."+amount);
    }
}
public class PaymentSystem{
    public static void main(String[] args){
        Payment p1 = new CreditCardPayment(2500);
        Payment p2 = new UPIPayment(1500);
        p1.processPayment();
        p2.processPayment();
    }
}