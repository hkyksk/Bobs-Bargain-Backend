import java.util.ArrayList;
import java.util.List;

public class Cart {
    private String cartId;
    private String userId;
    private List<Product> products;
    private double total;

    public Cart(String cartId, String userId) {
        this.cartId = cartId;
        this.userId = userId;
        this.products = new ArrayList<>();
        this.total = 0.0;
    }

    public void addToCart(Product product) {
        products.add(product);
        total += product.getPrice();
    }

    public void removeFromCart(Product product) {
        if (products.remove(product)) {
            total -= product.getPrice();
        }
    }

    public void removeAllFromCart() {
        total = 0.0;
        products.clear();
    }

    public void viewCart() {
        if (products.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("Total: " + total);
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
