package vehicles;

import generic.Vehicle;

public class Car extends Vehicle{
    public Car(String brand, String model, int year, double value) {
        super(brand, model, year, value);
    }

    @Override
    public double calcTax() {
        return 0.02 * value;
    }

    @Override
    public String toString() {
        return brand + " - " + model + " - " + year + " - R$" + value;
    }
}
