package vehicles;

import generic.Vehicle;

public class Bike extends Vehicle{
    public Bike(String brand, String model, int year, double value) {
        super(brand, model, year, value);
    }

    @Override
    public double calcTax() {
        return 0.0;
    }

    @Override
    public String toString() {
        return brand + " - " + model + " - " + year + " - R$" + value;
    }
}
