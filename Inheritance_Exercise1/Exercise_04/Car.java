/*
 * ==================== QUESTION ====================
 * Exercise 4: Vehicle Registration System
 * 1) Base class: Vehicle
 * - Variables: vehicleNumber (String), ownerName (String)
 * - Constructor: initialize both and print "Vehicle constructor called"
 * - Method (calculation): computeRegistrationFee()
 *    - Returns a base fee (e.g., 1000.0).
 *    - Print "Vehicle: computing base registration fee."
 * 2) Intermediate class: Car (extends Vehicle)
 * - Variable: carType (e.g., "Sedan", "SUV")
 * - Constructor: uses super(...) and prints "Car constructor called"
 * - Override (calculation): computeRegistrationFee()
 *    - Start with super.computeRegistrationFee().
 *    - If carType is "SUV", add +300; else add +150.
 *    - Print "Car: fee adjusted by car type."
 * 3) Intermediate class: SmartCar (extends Car)
 * - Variable: autopilotLevel (int, e.g., 0-3)
 * - Constructor: uses super(...) and prints "SmartCar constructor called"
 * - Override (calculation): computeRegistrationFee()
 *    - Start with super.computeRegistrationFee().
 *    - Add a software/ADAS maintenance surcharge: + (autopilotLevel * 100).
 *    - Print "SmartCar: fee adjusted by software/ADAS level."
 * 4) Derived class: ElectricCar (extends SmartCar)
 * - Variable: batteryCapacity (double, kWh)
 * - Constructor: uses super(...) and prints "ElectricCar constructor called"
 * - Override (calculation): computeRegistrationFee()
 *    - Start with super.computeRegistrationFee().
 *    - Apply eco adjustment:
 *       - Add road tax per kWh: + (batteryCapacity * 2)
 *       - Apply eco rebate: - 400
 *    - Print "ElectricCar: fee adjusted by battery capacity and eco rebate."
 * - Display method: showDetails()
 *    - Show all details (vehicleNumber, ownerName, carType, autopilotLevel,
 *        batteryCapacity).
 *    - Mention the fee policy (type-based + ADAS + EV adjustments).
 *    - Optionally indicate the final fee by calling the calculation method before/after
 *        the details.
 * 5) main() tasks
 * 1. Instantiate an ElectricCar with sample values, e.g.:
 *    - vehicleNumber = "DHA-1234"
 *    - ownerName = "Sakib"
 *    - carType = "SUV"
 *    - autopilotLevel = 2
 *    - batteryCapacity = 75.0
 * 2. Verify constructor order (prints):
 *    - "Vehicle constructor called" -> "Car constructor called" -> "SmartCar constructor
 *        called" -> "ElectricCar constructor called".
 * 3. Call showDetails() on the ElectricCar object.
 * 4. Call computeRegistrationFee() and note the override chain (prints from each class),
 *     and compute the final amount using the layered adjustments.
 * =================================================
 */

// ANSWER
public class Car extends Vehicle {
    protected String carType;

    public Car(String vehicleNumber, String ownerName, String carType) {
        super(vehicleNumber, ownerName);
        this.carType = carType;
        System.out.println("Car constructor called");
    }

    @Override
    public double computeRegistrationFee() {
        double fee = super.computeRegistrationFee();
        if (carType.equalsIgnoreCase("SUV")) {
            fee += 300;
        } else {
            fee += 150;
        }
        System.out.println("Car: fee adjusted by car type.");
        return fee;
    }
}
