package hw;
import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    String vehicleNumber;
    String brand;
    double baseRate;

    Vehicle(String vehicleNumber, String brand, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    abstract double calculateRentalCost(int days);

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Base Rate: ₹" + baseRate);
    }
}

interface Insurable {
    double getInsuranceCost();
}

class Car extends Vehicle implements Insurable {
    Car(String vehicleNumber, String brand, double baseRate) {
        super(vehicleNumber, brand, baseRate);
    }

    @Override
    double calculateRentalCost(int days) {
        return baseRate * days + 500;
    }

    @Override
    public double getInsuranceCost() {
        return 300;
    }
}

class Bike extends Vehicle {
    Bike(String vehicleNumber, String brand, double baseRate) {
        super(vehicleNumber, brand, baseRate);
    }

    @Override
    double calculateRentalCost(int days) {
        return baseRate * days;
    }
}

class Truck extends Vehicle implements Insurable {
    Truck(String vehicleNumber, String brand, double baseRate) {
        super(vehicleNumber, brand, baseRate);
    }

    @Override
    double calculateRentalCost(int days) {
        return (baseRate * days) + (1000 * days);
    }

    @Override
    public double getInsuranceCost() {
        return 800;
    }
}

class RentalAgency {
    List<Vehicle> vehicles = new ArrayList<>();

    void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    void generateRentalBill(String vehicleNumber, int days) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.vehicleNumber.equals(vehicleNumber)) {
                double rentalCost = vehicle.calculateRentalCost(days);
                double insuranceCost = 0;

                if (vehicle instanceof Insurable) {
                    Insurable insurable = (Insurable) vehicle;
                    insuranceCost = insurable.getInsuranceCost();
                }

                double total = rentalCost + insuranceCost;

                System.out.println("RENTAL BILL");
                System.out.println("Vehicle Number: " + vehicle.vehicleNumber);
                System.out.println("Brand: " + vehicle.brand);
                System.out.println("Days: " + days);
                System.out.println("Rental Cost: ₹" + rentalCost);
                System.out.println("Insurance Cost: ₹" + insuranceCost);
                System.out.println("Total Cost: ₹" + total);
                System.out.println();

                return;
            }
        }

        System.out.println("Vehicle not found.");
    }
}

public class day2_vehicle {
    public static void main(String[] args) {
        Car car = new Car("TN38AB1234", "Toyota", 2000);
        Bike bike = new Bike("TN38CD5678", "Yamaha", 800);
        Truck truck = new Truck("TN38EF9012", "Tata", 3000);

        RentalAgency agency = new RentalAgency();

        agency.addVehicle(car);
        agency.addVehicle(bike);
        agency.addVehicle(truck);

        System.out.println("CAR RENTAL");
        agency.generateRentalBill("TN38AB1234", 3);

        System.out.println("TRUCK RENTAL");
        agency.generateRentalBill("TN38EF9012", 2);

        System.out.println("BIKE RENTAL");
        agency.generateRentalBill("TN38CD5678", 4);
    }
}