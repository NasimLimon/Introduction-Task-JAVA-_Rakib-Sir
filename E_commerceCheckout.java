import java.util.ArrayList;
import java.util.List;

public class E_commerceCheckout {
    // Abstraction
interface CheckoutSystem {
    void addToCart(Product p);
    void checkout();
}

// Encapsulation
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
}

// Implementation
class ShoppingCart implements CheckoutSystem {
    private List<Product> cart = new ArrayList<>();

    public void addToCart(Product p) {
        cart.add(p);
        System.out.println(p.getName() + " যোগ করা হলো।");
    }

    public void checkout() {
        double total = 0;
        System.out.println("আপনার অর্ডারঃ");
        for (Product p : cart) {
            System.out.println("- " + p.getName() + ": " + p.getPrice() + " টাকা");
            total += p.getPrice();
        }
        System.out.println("মোট: " + total + " টাকা");
    }
}

}
