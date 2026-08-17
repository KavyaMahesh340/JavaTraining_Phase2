package task;
class InvalidPriceException extends Exception {
    public InvalidPriceException(String message) {
        super(message);
    }
}
abstract class Product {
    private String productId;
    private String productName;
    private double price;
    public Product(String productId, String productName, double price) throws InvalidPriceException {
        if (price <= 0) {
            throw new InvalidPriceException("Error: Price must be greater than zero for Product ID: " + productId);
        }
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
    public String getProductId(){ 
    	return productId; 
    }
    public String getProductName() { 
    	return productName;
    	}
    public double getPrice() {
    	return price; 
    	}
    public abstract double calculateDiscount();
    public double calculateFinalPrice() {
        return this.price - calculateDiscount();
    }
    public void displayProductDetails() {
        System.out.println("Product ID:      " + getProductId());
        System.out.println("Product Name:    " + getProductName());
        System.out.println("Original Price:  " + getPrice());
        System.out.println("Discount Amount: " + calculateDiscount());
        System.out.println("Final Price:     " + calculateFinalPrice());
    }
}
class Electronics extends Product {
    public Electronics(String productId, String productName, double price) throws InvalidPriceException {
        super(productId, productName, price);
    }
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }
}
class Clothing extends Product {
    public Clothing(String productId, String productName, double price) throws InvalidPriceException {
        super(productId, productName, price);
    }
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;
    }
}
class Grocery extends Product {
    public Grocery(String productId, String productName, double price) throws InvalidPriceException {
        super(productId, productName, price);
    }
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}
public class t1store {
    public static void main(String[] args) {
        System.out.println(" Processing Valid Products");
        processProduct("E101", "Smartphone", 699.99, "Electronics");
        processProduct("C202", "Denim Jacket", 49.99, "Clothing");
        processProduct("G303", "Organic Honey", 12.50, "Grocery");
        System.out.println("\n Processing Invalid Product");
        processProduct("G404", "Faulty Item", -5.00, "Grocery");
    }
    public static void processProduct(String id, String name, double price, String type) {
        Product product = null;
        try {
            if (type.equalsIgnoreCase("Electronics")) {
                product = new Electronics(id, name, price);
            } else if (type.equalsIgnoreCase("Clothing")) {
                product = new Clothing(id, name, price);
            } else if (type.equalsIgnoreCase("Grocery")) {
                product = new Grocery(id, name, price);
            }
            if (product != null) {
                product.displayProductDetails();
            }
        } catch (InvalidPriceException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Product processing completed.");
        }
    }
}
