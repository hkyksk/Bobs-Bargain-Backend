import java.util.ArrayList;
import java.util.List;

public class User {
    private String userId;
    private String username;
    private String fullName;
    private String email;
    private String password;
    private List<Product> cart;
    private List<Product> wishlist;
    private List<Order> orderHistory;

    // Constructor
    public User(String userId, String username, String fullName, String email, String password) {
        this.userId = userId;
        this.username = username;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.cart = new ArrayList<>();
        this.wishlist = new ArrayList<>();
        this.orderHistory = new ArrayList<>();
    }

    // Methods
    public void editUser(String username, String fullName, String email, String password) {
        this.username = username;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }

    public void removeUser() {
        // Code to remove user goes here
    }

    public void sortProducts() {
        // Code to sort products goes here
    }

    public void viewOrderHistory() {
        for (Order order : orderHistory) {
            System.out.println(order);
        }
    }

    // Getters and setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Product> getCart() {
        return cart;
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }

    public List<Product> getWishlist() {
        return wishlist;
    }

    public void setWishlist(List<Product> wishlist) {
        this.wishlist = wishlist;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(List<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }
}
