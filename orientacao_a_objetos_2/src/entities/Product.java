package entities;
public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {

    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) { /*SOBRECARGA - Uma operação com mesmo nome, porém, com parâmetros diferentes*/
        this.name = name;
        this.price = price;
    }

    public double TotalValueInStock() {
        return price * quantity;
    }

    public void AddProduct(int quantity) {
        this.quantity += quantity;
    }

    public void RemoveProduct(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return this.name + ", R$" + String.format("%.2f", this.price) + ", " + this.quantity + " units, Total: " + String.format("%.2f", this.TotalValueInStock());
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
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}