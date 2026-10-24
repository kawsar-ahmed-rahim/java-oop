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
import java.util.Arrays;
import java.util.List;

public class Patient {
    private static final List<String> VALID_BLOOD_GROUPS =
            Arrays.asList("A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-");

    private final int patientId;       // no setter
    private String patientName;
    private int age;
    private String bloodGroup;
    private double medicalBill;        // changed only via addMedicalCharge/makePayment

    public Patient(int patientId, String patientName, int age,
                   String bloodGroup, double medicalBill) {
        if (!isValidName(patientName)) {
            throw new IllegalArgumentException("Patient name must not be blank");
        }
        if (!isValidAge(age)) {
            throw new IllegalArgumentException("Age must be between 0 and 120");
        }
        if (!isValidBloodGroup(bloodGroup)) {
            throw new IllegalArgumentException("Invalid blood group: " + bloodGroup);
        }
        if (medicalBill < 0) {
            throw new IllegalArgumentException("Medical bill must not be negative");
        }
        this.patientId = patientId;
        this.patientName = patientName.trim();
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.medicalBill = medicalBill;
    }

    private static boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    private static boolean isValidAge(int age) {
        return age >= 0 && age <= 120;
    }

    private static boolean isValidBloodGroup(String group) {
        return group != null && VALID_BLOOD_GROUPS.contains(group);
    }

    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getAge() {
        return age;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public double getMedicalBill() {
        return medicalBill;
    }

    public void setPatientName(String patientName) {
        if (isValidName(patientName)) {
            this.patientName = patientName.trim();
        } else {
            System.out.println("Error: name cannot be blank. Previous value kept.");
        }
    }

    public void setAge(int age) {
        if (isValidAge(age)) {
            this.age = age;
        } else {
            System.out.println("Error: age must be between 0 and 120. Previous value kept.");
        }
    }

    public void setBloodGroup(String bloodGroup) {
        if (isValidBloodGroup(bloodGroup)) {
            this.bloodGroup = bloodGroup;
        } else {
            System.out.println("Error: '" + bloodGroup + "' is not a valid blood group.");
        }
    }

    public void addMedicalCharge(double amount) {
        if (amount <= 0) {
            System.out.println("Error: a charge must be a positive amount.");
        } else {
            medicalBill += amount;
            System.out.println("Charge of " + amount + " added. Outstanding bill: "
                    + medicalBill);
        }
    }

    public void makePayment(double amount) {
        if (amount <= 0) {
            System.out.println("Error: payment must be a positive amount.");
        } else if (amount > medicalBill) {
            System.out.println("Payment rejected: " + amount + " exceeds the outstanding bill ("
                    + medicalBill + ").");
        } else {
            medicalBill -= amount;
            System.out.println("Payment of " + amount + " accepted. Outstanding bill: "
                    + medicalBill);
        }
    }
}
