public class CurrencyConverter {
    // Simple converter for demonstration purposes
    public static double convert(double amount, Currency currency) {
        switch (currency) {
            case EUR: return amount * 0.85; // Assuming 1 USD = 0.85 EUR
            case GBP: return amount * 0.75; // Assuming 1 USD = 0.75 GBP
            case USD:
            default: return amount;
        }
    }
}
