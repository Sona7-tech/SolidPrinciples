package solidprinciples.dependencyinversion;

public class CreditCardPayment implements  PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("Credit card payment: $" + amount);
    }
}
