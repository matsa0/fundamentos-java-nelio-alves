package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int qnt) {
        this.name = name;
        this.price = price;
        this.quantity = qnt;
    }
    
    public double total() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return getName() + "," + total();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
