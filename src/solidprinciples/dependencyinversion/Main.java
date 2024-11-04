package solidprinciples.dependencyinversion;

public class Main {

    public static void main(String[] args) {
        PaymentService paymentService = new CreditCardPayment();
        OrderService orderService = new OrderService(paymentService);

        orderService.placeOrder(150.0);

        // Başqa bir ödəniş üsulunu da dəyişmək asandır:
        paymentService = new PayPalPayment();
        orderService = new OrderService(paymentService);

        orderService.placeOrder(200.0);
    }
}
