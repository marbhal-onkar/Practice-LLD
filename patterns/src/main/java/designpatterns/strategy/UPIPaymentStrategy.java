package designpatterns.strategy;

public class UPIPaymentStrategy implements PaymentStrategy{


    @Override
    public void pay() {
        System.out.println("Paying using UPI !");
    }
}
