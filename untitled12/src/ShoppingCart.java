import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }
    public List<Product> getProducts() {
        return products;
    }


    public double calculateTotal() {
        return products.stream().mapToDouble(p -> p.getPrice() * p.getQuantity()).sum();
    }

    public void checkout(PaymentStrategy paymentStrategy, Currency currency) {
        double amount = calculateTotal();
        double convertedAmount = CurrencyConverter.convert(amount, currency);
        paymentStrategy.processPayment(convertedAmount);
    }

}

