public class ShoppingCartDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Book", 10.99, 1));
        cart.addProduct(new Product("Shirt", 29.99, 2));

        // Using credit card payment
        String cardNumber = "1234567890123456";

        cart.checkout(new CreditCardPayment(cardNumber), Currency.USD);





        CreditCardPayment payment = new CreditCardPayment(cardNumber);

    }
}
