/*
 * ==================== QUESTION ====================
 * Exercise 1: Student Information Management
 * Create a Java class named Student with the following private attributes:
 * Attribute   Data type
 * name        String
 * age         int
 * cgpa        double
 * Requirements:
 * 1. Create a parameterized constructor to initialize the attributes.
 * 2. Implement getter and setter methods for all attributes.
 * 3. In setAge(), accept only values between 18 and 30.
 * 4. In setCgpa(), accept only values between 0.0 and 4.0.
 * 5. In setName(), reject null, empty, or whitespace-only names.
 * 6. If invalid data is provided, display an error message and keep the previous value.
 * 7. Create a displayInfo() method that uses getter methods.
 * =================================================
 */



class Student {
    private String name;
    private int age;
    private double cgpa;

    
    Student(String name, int age, double cgpa) {
        this.name = "Unknown";
        this.age = 18;
        this.cgpa = 0.0;

        setName(name);
        setAge(age);
        setCgpa(cgpa);
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getCgpa() {
        return cgpa;
    }

 
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Invalid name!");
        }
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 30) {
            this.age = age;
        } else {
            System.out.println("Error: Age must be between 18 and 30!");
        }
    }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Error: CGPA must be between 0.0 and 4.0!");
        }
    }

   
    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("CGPA: " + getCgpa());
    }

    public static void main(String[] args) {

        Student s1 = new Student("Rahim", 22, 3.75);

        s1.displayInfo();

        System.out.println("\nAfter updating information:");

        s1.setName("Karim");
        s1.setAge(25);
        s1.setCgpa(3.90);

        s1.displayInfo();

        System.out.println("\nTesting invalid values:");

        s1.setName(" ");
        s1.setAge(35);
        s1.setCgpa(4.5);

        s1.displayInfo();
    }
}
