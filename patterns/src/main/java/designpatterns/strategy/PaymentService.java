package designpatterns.strategy;

public class PaymentService {

    private PaymentStrategy mode;

    public PaymentService(PaymentStrategy mode) {
        this.mode = mode;
    }

    public void makePayment(){
        mode.pay();
    }
}
