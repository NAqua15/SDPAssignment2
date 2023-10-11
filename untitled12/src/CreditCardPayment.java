public class CreditCardPayment implements PaymentStrategy {

    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {

        System.out.println("Processed payment of " + amount + " via Credit Card: " + cardNumber);
    }
}

