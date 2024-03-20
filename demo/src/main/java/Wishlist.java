import java.util.ArrayList;
import java.util.List;

public class Wishlist {
    private String wishlistId;
    private String userId;
    private List<Product> products;

    public Wishlist(String wishlistId, String userId) {
        this.wishlistId = wishlistId;
        this.userId = userId;
        this.products = new ArrayList<>();
    }

    public void viewWishlist() {
        if (products.isEmpty()) {
            System.out.println("Wishlist is empty.");
            return;
        }
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void removeFromWishlist(Product product) {
        products.remove(product);
    }

    public void addToWishlist(Product product) {
        products.add(product);
    }

    public void removeAllFromWishlist() {
        products.clear();
    }

    public String getWishlistId() {
        return wishlistId;
    }

    public void setWishlistId(String wishlistId) {
        this.wishlistId = wishlistId;
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
}
