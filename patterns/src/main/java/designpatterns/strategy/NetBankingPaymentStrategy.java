package designpatterns.strategy;

public class NetBankingPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("Paying using NetBanking !");
    }
}
