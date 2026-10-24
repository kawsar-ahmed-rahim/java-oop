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
public class Main {
    public static void main(String[] args) {
        // Runtime polymorphism: every element is a Patient reference,
        // but each refers to a different kind of object.
        Patient[] patients = {
            new InPatient(1, "Rahim", 500, 5, 2000),
            new OutPatient(2, "Karim", 300, 1200),
            new InPatient(3, "Sumi", 800, 2, 3500),
            new OutPatient(4, "Anika", 400, 0),
            new Patient(5, "Walk-in Visitor", 250)
        };

        for (Patient p : patients) {
            p.displayBill();
            System.out.println();
        }

        // Challenge: which overridden method runs for a parent reference?
        System.out.println("--- Which calculateBill() ran? ---");
        for (Patient p : patients) {
            System.out.println("Reference type: Patient | Actual object: "
                    + p.getClass().getSimpleName()
                    + " | " + p.getClass().getSimpleName() + ".calculateBill() -> "
                    + p.calculateBill());
        }
        System.out.println();
        System.out.println("Answer: the JVM chooses the method from the ACTUAL object type");
        System.out.println("(dynamic method dispatch), not from the reference type. So an");
        System.out.println("InPatient object referred to by a Patient variable runs");
        System.out.println("InPatient.calculateBill() and InPatient.displayBill().");
    }
}
