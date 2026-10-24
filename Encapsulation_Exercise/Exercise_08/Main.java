/*
 * ==================== QUESTION ====================
 * Exercise 8: Hospital Patient Record
 * Create a class named Patient with private attributes patientId, patientName, age,
 *     bloodGroup, and medicalBill.
 * Requirements:
 * 1. Create a parameterized constructor.
 * 2. Provide getters for all attributes.
 * 3. Do not provide a setter for patientId.
 * 4. Validate age within the range 0-120.
 * 5. Validate bloodGroup against the accepted values: A+, A-, B+, B-, AB+, AB-, O+, and
 *     O-.
 * 6. Allow patient name changes only when the new name is not blank.
 * 7. Do not provide a direct public setter for medicalBill.
 * 8. Create addMedicalCharge(double amount) to add positive charges.
 * 9. Create makePayment(double amount) to reduce the outstanding bill without allowing
 *     overpayment.
 * =================================================
 */

// ANSWER
public class Main {
    public static void main(String[] args) {
        Patient p = new Patient(1, "Rahim", 35, "B+", 2000);
        System.out.println("ID " + p.getPatientId() + " | " + p.getPatientName()
                + " | age " + p.getAge() + " | " + p.getBloodGroup()
                + " | bill " + p.getMedicalBill());

        System.out.println();
        p.setAge(150);
        p.setAge(-3);
        p.setBloodGroup("C+");
        p.setPatientName("  ");
        p.setAge(36);
        p.setBloodGroup("O-");
        p.setPatientName("Rahim Uddin");

        System.out.println();
        p.addMedicalCharge(1500);
        p.addMedicalCharge(-100);
        p.makePayment(1000);
        p.makePayment(9999);      // overpayment rejected
        p.makePayment(2500);      // pays the remaining bill exactly

        System.out.println();
        System.out.println("ID " + p.getPatientId() + " | " + p.getPatientName()
                + " | age " + p.getAge() + " | " + p.getBloodGroup()
                + " | bill " + p.getMedicalBill());
    }
}
