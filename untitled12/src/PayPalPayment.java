public class PayPalPayment implements PaymentStrategy {

    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void processPayment(double amount) {
        // Logic to process PayPal payment
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

