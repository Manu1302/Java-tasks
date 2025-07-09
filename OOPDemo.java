import java.util.Scanner;

class Vehicle {
    void startEngine() {
        System.out.println("Vehicle engine started");
    }
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started");
    }
}

class Bike extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Bike engine started");
    }
}

public class OOPDemo {

    static void runVehicle(String type) {
        Vehicle v;

        if (type.equalsIgnoreCase("car")) {
            v = new Car();
        } else if (type.equalsIgnoreCase("bike")) {
            v = new Bike();
        } else {
            v = new Vehicle();
        }

        v.startEngine();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter vehicle type (car/bike): ");
        String choice = scanner.nextLine();

        runVehicle(choice);

        scanner.close();
    }
}

