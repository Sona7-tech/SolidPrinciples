package solidprinciples.dependencyinversion;

public class PayPalPayment implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal payment: $" + amount);
    }
}
