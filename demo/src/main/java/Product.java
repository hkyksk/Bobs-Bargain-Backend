public class Product {
    private String productId;
    private String name;
    private String description;
    private double price;
    private String category;
    private int stock;

    // Constructor
    public Product(String productId, String name, String description, double price, String category, int stock) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }

    // Method to add product to cart
    public void addToCart(User user) {

        UserService.addToCart(user, this); // Pass the user and current product
    }

    // Method to add product to wishlist
    public void addToWishlist(User user) {

        UserService.addToWishlist(user, this); // Pass the user and current product
    }

    // Getters and setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
