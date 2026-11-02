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

class Patient {

    private int patientId;
    private String patientName;
    private int age;
    private String bloodGroup;
    private double medicalBill;

    Patient(int patientId, String patientName, int age, String bloodGroup, double medicalBill) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.medicalBill = medicalBill;
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
        if (patientName != null && !patientName.trim().isEmpty()) {
            this.patientName = patientName;
        } else {
            System.out.println("Error: Invalid patient name!");
        }
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Error: Age must be between 0 and 120!");
        }
    }

    public void setBloodGroup(String bloodGroup) {
        if (bloodGroup != null &&
                (bloodGroup.equals("A+") || bloodGroup.equals("A-") ||
                        bloodGroup.equals("B+") || bloodGroup.equals("B-") ||
                        bloodGroup.equals("AB+") || bloodGroup.equals("AB-") ||
                        bloodGroup.equals("O+") || bloodGroup.equals("O-"))) {

            this.bloodGroup = bloodGroup;

        } else {
            System.out.println("Error: Invalid blood group!");
        }
    }

    public void addMedicalCharge(double amount) {
        if (amount > 0) {
            medicalBill += amount;
            System.out.println("Medical charge added successfully!");
        } else {
            System.out.println("Error: Amount must be positive!");
        }
    }

    public void makePayment(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Payment must be positive!");
        } else if (amount > medicalBill) {
            System.out.println("Error: Overpayment not allowed!");
        } else {
            medicalBill -= amount;
            System.out.println("Payment successful!");
        }
    }

    public void displayInfo() {
        System.out.println("Patient ID: " + getPatientId());
        System.out.println("Patient Name: " + getPatientName());
        System.out.println("Age: " + getAge());
        System.out.println("Blood Group: " + getBloodGroup());
        System.out.println("Medical Bill: " + getMedicalBill());
    }

    public static void main(String[] args) {

        Patient p = new Patient(101, "Rahim", 22, "B+", 5000);

        System.out.println("Initial Patient Information:");
        p.displayInfo();

        System.out.println("\nAfter Updating Information:");

        p.setPatientName("Karim");
        p.setAge(25);
        p.setBloodGroup("O+");
        p.displayInfo();

        System.out.println("\nAfter Adding Medical Charge:");

        p.addMedicalCharge(2000);
        System.out.println("Updated Bill: " + p.getMedicalBill());

        System.out.println("\nAfter Making Payment:");

        p.makePayment(3000);
        System.out.println("Remaining Bill: " + p.getMedicalBill());

        System.out.println("\nTesting Invalid Values:");

        p.setPatientName(" ");
        p.setAge(150);
        p.setBloodGroup("C+");
        p.makePayment(10000);

        p.displayInfo();
    }
}
