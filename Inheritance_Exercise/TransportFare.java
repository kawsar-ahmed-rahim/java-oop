/*
 * ==================== QUESTION ====================
 * Exercise 9: Transport Fare Calculation System
 * Create a superclass Transport containing vehicleNumber, distance, and baseFare. Create
 *     three subclasses: Bus, Taxi, and Train.
 * Requirements:
 * 1. Define parameterized constructors for all classes.
 * 2. Each subclass must use super() to initialize common fields.
 * 3. Define calculateFare() in Transport returning baseFare.
 * 4. Override this method according to the following rules.
 * Transport   Fare formula
 * Bus         baseFare + distance x 5
 * Taxi        baseFare + distance x 20
 * Train       baseFare + distance x 3
 * 5. Store different transport objects inside a Transport[] array.
 * 6. Use a loop to display their calculated fares.
 * Challenge: Create an overridden displayDetails() method that calls calculateFare().
 * =================================================
 */


class Transport {
    protected String vehicleNumber;
    protected double distance;
    protected double baseFare;

    public Transport(String vehicleNumber, double distance, double baseFare) {
        this.vehicleNumber = vehicleNumber;
        this.distance = distance;
        this.baseFare = baseFare;
    }

    public double calculateFare() {
        return baseFare;
    }

    
    public void displayDetails() {
        System.out.println("Vehicle Number  : " + vehicleNumber);
        System.out.println("Distance        : " + distance + " km");
        System.out.println("Calculated Fare : " + calculateFare());
    }
}

class Bus extends Transport {
    public Bus(String vehicleNumber, double distance, double baseFare) {
        super(vehicleNumber, distance, baseFare);
    }

    @Override
    public double calculateFare() {
        return baseFare + distance * 5;
    }

    @Override
    public void displayDetails() {
        System.out.println("Type            : Bus");
        super.displayDetails();
    }
}

class Taxi extends Transport {
    public Taxi(String vehicleNumber, double distance, double baseFare) {
        super(vehicleNumber, distance, baseFare);
    }

    @Override
    public double calculateFare() {
        return baseFare + distance * 20;
    }

    @Override
    public void displayDetails() {
        System.out.println("Type            : Taxi");
        super.displayDetails();
    }
}

class Train extends Transport {
    public Train(String vehicleNumber, double distance, double baseFare) {
        super(vehicleNumber, distance, baseFare);
    }

    @Override
    public double calculateFare() {
        return baseFare + distance * 3;
    }

    @Override
    public void displayDetails() {
        System.out.println("Type            : Train");
        super.displayDetails();
    }
}

public class TransportFare {
    public static void main(String[] args) {
        Transport[] transports = {
            new Bus("BUS-101", 20, 50),
            new Taxi("TAXI-77", 12, 100),
            new Train("TRN-9", 150, 80)
        };

        for (Transport t : transports) {
            t.displayDetails();
            System.out.println();
        }
    }
}
