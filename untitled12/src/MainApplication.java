import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Demonstrate Singleton Pattern");
            System.out.println("2. Use the Shopping Cart");
            System.out.println("3. Exit");
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left by nextInt()

            switch (choice) {
                case 1:
                    ThreadSafetyTest.demonstrate();
                    break;
                case 2:
                    useShoppingCart(scanner);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }

    private static void useShoppingCart(Scanner scanner) {
        ShoppingCart cart = new ShoppingCart();
        while (true) {
            System.out.println("\nShopping Cart Menu:");
            System.out.println("1. Add Product");
            System.out.println("2. Checkout");
            System.out.println("3. Go Back");
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    cart.addProduct(new Product(name, price, quantity));
                    break;

                case 2:
                    if (cart.getProducts().isEmpty()) {
                        System.out.println("Cart is empty. Add some products first.");
                        break;
                    }
                    System.out.println("\nChoose Payment Method:");
                    System.out.println("1. Credit Card");
                    System.out.println("2. PayPal");
                    System.out.print("Your choice: ");
                    int paymentChoice = scanner.nextInt();

                    System.out.println("\nChoose Currency:");
                    System.out.println("1. USD");
                    System.out.println("2. EUR");
                    System.out.print("Your choice: ");
                    int currencyChoice = scanner.nextInt();
                    Currency currency = currencyChoice == 1 ? Currency.USD : Currency.EUR;

                    if (paymentChoice == 1) {
                        System.out.print("Enter Credit Card number: ");
                        String cardNumber = scanner.next();

                        cart.checkout(new CreditCardPayment(cardNumber), Currency.USD);

                    } else {
                        System.out.print("Enter PayPal email: ");
                        String email = scanner.next();
                        System.out.print("Enter PayPal password: ");
                        String password = scanner.next();
                        cart.checkout(new PayPalPayment(email, password), Currency.USD);
                    }
                    break;



                case 3:
                    return; // Go back to the main menu
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}
