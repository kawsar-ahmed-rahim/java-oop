// Exercise 11: Electricity Bill
// Create a class ElectricityBill.
// Variables:
// String customerName;
// int units;
// Create a constructor.
// Method
// double calculateBill()
// void displayBill()
// Use these rules:
// First 100 units = 5 taka/unit
// Next 100 units = 7 taka/unit
// Above 200 units = 10 taka/unit

class ElectricityBill {
    String customerName;
    int units;

    // Constructor
    ElectricityBill(String customerName, int units) {
        this.customerName = customerName;
        this.units = units;
    }

    // Calculate bill
    double calculateBill() {
        double bill;

        if (units <= 100) {
            bill = units * 5;
        } 
        else if (units <= 200) {
            bill = (100 * 5) + ((units - 100) * 7);
        } 
        else {
            bill = (100 * 5) + (100 * 7) + ((units - 200) * 10);
        }

        return bill;
    }

    // Display bill
    void displayBill() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units: " + units);
        System.out.println("Electricity Bill: " + calculateBill() + " Taka");
    }

    public static void main(String[] args) {
        ElectricityBill e1 = new ElectricityBill("Rahim", 250);

        e1.displayBill();
    }
}