import java.time.LocalDate;
import java.util.List;

public class Order {
    private String orderId;
    private String userId;
    private List<Product> products;
    private double total;
    private LocalDate date;

    public Order(String orderId, String userId, List<Product> products, double total, LocalDate date) {
        this.orderId = orderId;
        this.userId = userId;
        this.products = products;
        this.total = total;
        this.date = date;
    }

    public static Order placeOrder(String orderId, String userId, List<Product> products, double total) {
        LocalDate date = LocalDate.now();
        return new Order(orderId, userId, products, total, date);
    }

    public static void viewOrderHistory(List<Order> orderHistory) {
        if (orderHistory.isEmpty()) {
            System.out.println("No orders found in order history.");
            return;
        }
        for (Order order : orderHistory) {
            System.out.println(order);
        }
    }

    public static Order copyOrder(Order order) {
        return new Order(order.getOrderId(), order.getUserId(), order.getProducts(), order.getTotal(), order.getDate());
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", userId='" + userId + '\'' +
                ", products=" + products +
                ", total=" + total +
                ", date=" + date +
                '}';
    }
}
