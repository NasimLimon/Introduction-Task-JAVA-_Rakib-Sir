import java.util.ArrayList;
import java.util.List;

// Product class
class Product {
    private int id;
    private String productName;
    private int pricePerUnit;

    public void setVariable(int id, String productName, int pricePerUnit) {
        this.id = id;
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return pricePerUnit;
    }

    @Override
    public String toString() {
        return productName + " ($" + pricePerUnit + ")";
    }
}

// Customer class
class Customer {
    private String userId;
    private String name;
    private String phoneNo;

    public void setCustomer(String userId, String name, String phoneNo) {
        this.userId = userId;
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void registerUser() {
        System.out.println("Customer " + name + " registered with phone: " + phoneNo);
    }
}

// ShoppingCart class
class ShoppingCart {
    private int cartId;
    private String userId;
    private List<String> productList;

    public ShoppingCart(int cartId, String userId) {
        this.cartId = cartId;
        this.userId = userId;
        this.productList = new ArrayList<>();
    }

    public void addProduct(String product) {
        productList.add(product);
        System.out.println(product + " added to cart.");
    }

    public List<String> getProductList() {
        return productList;
    }

    public void displayCart() {
        System.out.println("\nCart ID: " + cartId + ", User ID: " + userId);
        System.out.println("Products in cart:");
        for (String product : productList) {
            System.out.println("- " + product);
        }
    }

    public void createCart() {
        System.out.println("Cart created for user: " + userId);
    }

    public int getCartId() {
        return cartId;
    }

    public String getUserId() {
        return userId;
    }
}

// Payment class
class Payment {
    private int paymentId;
    private int totalAmount;
    private String status;

    public void setPayment(int paymentId, int totalAmount, String status) {
        this.paymentId = paymentId;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public int calculatePrice(List<Product> products) {
        int total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void makePayment(int amount) {
        this.totalAmount = amount;
        this.status = "Paid";
        System.out.println("Payment of $" + totalAmount + " made successfully.");
    }

    public int getPaymentId() {
        return paymentId;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }
}

// Main class
public class ShopSystem {
    public static void main(String[] args) {
        // Create and register customer
        Customer customer = new Customer();
        customer.setCustomer("user123", "Alice", "1234567890");
        customer.registerUser();

        // Create products
        Product laptop = new Product();
        laptop.setVariable(1, "Laptop", 1000);

        Product mouse = new Product();
        mouse.setVariable(2, "Mouse", 25);

        // Create shopping cart
        ShoppingCart cart = new ShoppingCart(101, customer.getUserId());
        cart.createCart();
        cart.addProduct(laptop.toString());
        cart.addProduct(mouse.toString());
        cart.displayCart();

        // Prepare for payment
        List<Product> productObjects = new ArrayList<>();
        productObjects.add(laptop);
        productObjects.add(mouse);

        Payment payment = new Payment();
        int total = payment.calculatePrice(productObjects);
        payment.makePayment(total);
    }
}
