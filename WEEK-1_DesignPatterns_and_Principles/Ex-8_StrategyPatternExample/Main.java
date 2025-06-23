public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        context.setPaymentStrategy(new CreditCardPayment());
        context.executePayment();  // Output: Paid using Credit Card.

        // Switch to PayPal
        context.setPaymentStrategy(new PayPalPayment());
        context.executePayment();  // Output: Paid using PayPal.
    }
}

