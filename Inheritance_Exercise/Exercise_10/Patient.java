/*
 * ==================== QUESTION ====================
 * Exercise 10: Hospital Billing System
 * Create a superclass Patient containing patientId, name, and consultationFee. Create two
 *     subclasses: InPatient and OutPatient.
 * Additional attributes:
 * - InPatient: daysAdmitted, dailyRoomCharge
 * - OutPatient: testCharge
 * Requirements:
 * 1. Create constructors for all three classes.
 * 2. Both subclasses must invoke the superclass constructor using super().
 * 3. Define calculateBill() in Patient, returning the consultation fee.
 * 4. Override calculateBill() in InPatient to add room charges.
 * 5. Override calculateBill() in OutPatient to add test charges.
 * 6. Override displayBill() in the subclasses, reusing the superclass method where
 *     appropriate.
 * 7. Create several patient objects and display their bills.
 * 8. Demonstrate runtime polymorphism using an array of Patient references.
 * Challenge: Identify which overridden method executes when a parent reference points to a
 *     child object.
 * =================================================
 */

// ANSWER
public class Patient {
    protected int patientId;
    protected String name;
    protected double consultationFee;

    public Patient(int patientId, String name, double consultationFee) {
        this.patientId = patientId;
        this.name = name;
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee;
    }

    public void displayBill() {
        System.out.println("Patient ID       : " + patientId);
        System.out.println("Name             : " + name);
        System.out.println("Consultation Fee : " + consultationFee);
        System.out.println("Total Bill       : " + calculateBill());
    }
}
