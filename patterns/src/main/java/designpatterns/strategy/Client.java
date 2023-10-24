package designpatterns.strategy;

public class Client {

    private static boolean isNetBankingStrategy;
    private static boolean isUPIStrategy = true;

    public static void main(String[] args) {
        PaymentStrategy strategy = null;

        if(isUPIStrategy) {
            strategy = new UPIPaymentStrategy();
        }else if(isNetBankingStrategy) {
            strategy = new NetBankingPaymentStrategy();
        }

        PaymentService service = new PaymentService(strategy);
        service.makePayment();
    }
}
