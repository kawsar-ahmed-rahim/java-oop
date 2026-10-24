// Exercise 1 — Student Information
// Create a class Student with private fields name, id, and cgpa.
// Requirements:
// Use private data members.
// Create getter and setter methods.
// CGPA must be between 0.0 and 4.0.
// If an invalid CGPA is provided, display an appropriate message.
// In main(), create a student, set the values, and display them.


class Student {
    private String name;
    private int id;
    private double cgpa;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA! CGPA must be between 0.0 and 4.0.");
        }
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class StudentInformation {
    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Kawsar");
        student.setId(101);
        student.setCgpa(3.75);

        System.out.println("Student Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("CGPA: " + student.getCgpa());
    }
}



