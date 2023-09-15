package main;

import generic.Vehicle;
import vehicles.Bike;
import vehicles.Car;
import vehicles.Motorcycle;

public class App {
    public static void main(String[] args) throws Exception {
        Vehicle motorcycle = new Motorcycle("Yamaha", "Crypton", 2010, 12000);
        System.out.println(motorcycle);

        Vehicle bike = new Bike("TSW", "TSW Elite 9050", 2023, 23000);
        System.out.println(bike);

        Vehicle car = new Car("Ford", "Focus", 2019, 139000);
        System.out.println(car);
    }
}
