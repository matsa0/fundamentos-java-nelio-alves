package generic;

public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    protected double value;

    public Vehicle(String brand, String model, int year, double value) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.value = value;
    }

    public abstract double calcTax();
}
