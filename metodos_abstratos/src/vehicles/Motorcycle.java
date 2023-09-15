package vehicles;

import generic.Vehicle;

public class Motorcycle extends Vehicle{
    public Motorcycle(String brand, String model, int year, double value) {
        super(brand, model, year, value);
    }

    @Override
    public double calcTax() {
        return 0.015 * value;
    }

    @Override
    public String toString() {
        return brand + " - " + model + " - " + year + " - R$" + value;
    }
}
