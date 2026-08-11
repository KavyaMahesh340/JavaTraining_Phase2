package hw;
class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotalPrice() {
        return price * quantity;
    }

    double applyDiscount(double amount) {
        if (amount >= 5000)
            return amount * 0.10;
        else if (amount >= 3000)
            return amount * 0.05;
        else
            return 0;
    }

    void displayProduct() {
        System.out.println(productId + "  " + productName + "  ₹" + price + "  " + quantity
                + "  ₹" + calculateTotalPrice());
    }
}

public class day1_billing {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 50000, 1);
        Product p2 = new Product(102, "Mouse", 800, 2);
        Product p3 = new Product(103, "Keyboard", 1500, 1);
        Product p4 = new Product(104, "Monitor", 12000, 2);
        Product p5 = new Product(105, "Headphones", 2500, 3);

        double subtotal = p1.calculateTotalPrice()
                + p2.calculateTotalPrice()
                + p3.calculateTotalPrice()
                + p4.calculateTotalPrice()
                + p5.calculateTotalPrice();

        double discount = p1.applyDiscount(subtotal);
        double taxableAmount = subtotal - discount;
        double gst = taxableAmount * 0.18;
        double finalAmount = taxableAmount + gst;

        Product expensive = p1;
        Product cheapest = p1;
        Product highestQuantity = p1;

        if (p2.price > expensive.price) expensive = p2;
        if (p3.price > expensive.price) expensive = p3;
        if (p4.price > expensive.price) expensive = p4;
        if (p5.price > expensive.price) expensive = p5;

        if (p2.price < cheapest.price) cheapest = p2;
        if (p3.price < cheapest.price) cheapest = p3;
        if (p4.price < cheapest.price) cheapest = p4;
        if (p5.price < cheapest.price) cheapest = p5;

        if (p2.quantity > highestQuantity.quantity) highestQuantity = p2;
        if (p3.quantity > highestQuantity.quantity) highestQuantity = p3;
        if (p4.quantity > highestQuantity.quantity) highestQuantity = p4;
        if (p5.quantity > highestQuantity.quantity) highestQuantity = p5;

        int totalItems = p1.quantity + p2.quantity + p3.quantity + p4.quantity + p5.quantity;

        System.out.println("PRODUCT BILL");
        System.out.println("ID  Name  Price  Quantity  Total");

        p1.displayProduct();
        p2.displayProduct();
        p3.displayProduct();
        p4.displayProduct();
        p5.displayProduct();

        System.out.println("\nSubtotal: ₹" + subtotal);
        System.out.println("Discount: ₹" + discount);
        System.out.println("GST: ₹" + gst);
        System.out.println("Final Bill Amount: ₹" + finalAmount);

        System.out.println("\nMost Expensive Product: " + expensive.productName);
        System.out.println("Cheapest Product: " + cheapest.productName);
        System.out.println("Highest Quantity Product: " + highestQuantity.productName);
        System.out.println("Total Number of Items: " + totalItems);
    }
}