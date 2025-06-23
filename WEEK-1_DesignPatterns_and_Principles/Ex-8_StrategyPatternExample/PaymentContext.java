public class PaymentContext {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment() {
        if (strategy != null) {
            strategy.pay();
        } else {
            System.out.println("No payment strategy selected.");
        }
    }
}
