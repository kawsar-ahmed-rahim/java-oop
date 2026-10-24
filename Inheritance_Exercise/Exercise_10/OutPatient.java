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
public class OutPatient extends Patient {
    private double testCharge;

    public OutPatient(int patientId, String name, double consultationFee,
                      double testCharge) {
        super(patientId, name, consultationFee);
        this.testCharge = testCharge;
    }

    @Override
    public double calculateBill() {
        return super.calculateBill() + testCharge;
    }

    @Override
    public void displayBill() {
        System.out.println("===== Out-Patient Bill =====");
        super.displayBill();
        System.out.println("Test Charges     : " + testCharge);
    }
}
