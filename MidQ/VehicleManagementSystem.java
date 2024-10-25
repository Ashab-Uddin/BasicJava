/*
 * Suppose you are to design a Vehicle Management System for your varsity where a class named Vehicle from which 3 classes: Bus, Coaster_Bus and HiAce_Car will inherit some attributes such as Mileage and Capacity and a method Realtime_speed(). You are allowed to assign the value of the parent class only from its child class. Now write a Java program as follows:

 */
package MidQ;


// Base class Vehicle
abstract class Vehicle {
    protected double mileage;   // Mileage in km/l
    protected int capacity;     // Capacity in number of passengers

    // Constructor for Vehicle (cannot instantiate Vehicle directly)
    Vehicle(double mileage, int capacity) {
        this.mileage = mileage;
        this.capacity = capacity;
    }

    // Abstract method to be implemented by subclasses
    abstract void Realtime_speed();
}

// Class Bus that inherits from Vehicle
class Bus extends Vehicle {

    // Constructor for Bus class
    Bus(double mileage, int capacity) {
        super(mileage, capacity); // Call the constructor of Vehicle
    }

    // Implementing the abstract method Realtime_speed for Bus
    @Override
    void Realtime_speed() {
        System.out.println("Bus is running at 50 km/h.");
    }

    // Method to display Bus details
    void displayInfo() {
        System.out.println("Bus Mileage: " + mileage + " km/l, Capacity: " + capacity + " passengers.");
    }
}

// Class Coaster_Bus that inherits from Vehicle
class Coaster_Bus extends Vehicle {

    // Constructor for Coaster_Bus class
    Coaster_Bus(double mileage, int capacity) {
        super(mileage, capacity); // Call the constructor of Vehicle
    }

    // Implementing the abstract method Realtime_speed for Coaster_Bus
    @Override
    void Realtime_speed() {
        System.out.println("Coaster Bus is running at 60 km/h.");
    }

    // Method to display Coaster Bus details
    void displayInfo() {
        System.out.println("Coaster Bus Mileage: " + mileage + " km/l, Capacity: " + capacity + " passengers.");
    }
}

// Class HiAce_Car that inherits from Vehicle
class HiAce_Car extends Vehicle {

    // Constructor for HiAce_Car class
    HiAce_Car(double mileage, int capacity) {
        super(mileage, capacity); // Call the constructor of Vehicle
    }

    // Implementing the abstract method Realtime_speed for HiAce_Car
    @Override
    void Realtime_speed() {
        System.out.println("HiAce Car is running at 70 km/h.");
    }

    // Method to display HiAce Car details
    void displayInfo() {
        System.out.println("HiAce Car Mileage: " + mileage + " km/l, Capacity: " + capacity + " passengers.");
    }
}

// Main class to test the functionality
public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Create a Bus object
        Bus bus = new Bus(5.0, 40);  // Mileage 5.0 km/l, Capacity 40 passengers
        bus.Realtime_speed();        // Output: Bus is running at 50 km/h.
        bus.displayInfo();           // Output: Bus Mileage: 5.0 km/l, Capacity: 40 passengers.

        // Create a Coaster_Bus object
        Coaster_Bus coasterBus = new Coaster_Bus(8.0, 25);  // Mileage 8.0 km/l, Capacity 25 passengers
        coasterBus.Realtime_speed();                        // Output: Coaster Bus is running at 60 km/h.
        coasterBus.displayInfo();                           // Output: Coaster Bus Mileage: 8.0 km/l, Capacity: 25 passengers.

        // Create a HiAce_Car object
        HiAce_Car hiAceCar = new HiAce_Car(12.0, 15);       // Mileage 12.0 km/l, Capacity 15 passengers
        hiAceCar.Realtime_speed();                          // Output: HiAce Car is running at 70 km/h.
        hiAceCar.displayInfo();                             // Output: HiAce Car Mileage: 12.0 km/l, Capacity: 15 passengers.
    }
}


