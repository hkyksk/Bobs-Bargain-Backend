public class Admin {
    private String adminId;
    private String username;
    private String password;
    private String fullName;
    private String email;

    // Constructor
    public Admin(String adminId, String username, String password, String fullName, String email) {
        this.adminId = adminId;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.email = email;
    }

    // Method to add a product
    public void addProduct(Product product) {
        ProductService.addProduct(product);
    }

    // Method to edit a product
    public void editProduct(Product product, String newName, double newPrice, int newQuantity) {
        product.setName(newName);
        product.setPrice(newPrice);
        product.setQuantity(newQuantity);
        ProductService.updateProduct(product);
    }

    // Method to remove a product
    public void removeProduct(Product product) {
        ProductService.removeProduct(product);
    }

    // Getters and setters
    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
}
