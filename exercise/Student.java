// Exercise 2: Student
// •
// Constructors:
// 1.
// Accepts only id.
// 2.
// Accepts id and name.
// 3.
// Accepts id, name, and grade.
// •
// Method Overloading:
// o
// updateGrade(char grade)
// o
// updateGrade(double marks) (converts marks to grade internally).
// •
// Normal Method:
// o
// showDetails() → print student details.

class Student {
    int id;
    String name;
    char grade;

    Student(int id) {
        this.id = id;
        this.name = "Unknown";
        this.grade = 'N';
    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.grade = 'N';
    }

    Student(int id, String name, char grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    void updateGrade(char grade) {
        this.grade = grade;
    }

    void updateGrade(double marks) {
        if (marks >= 80) {
            grade = 'A';
        } else if (marks >= 60) {
            grade = 'B';
        } else if (marks >= 40) {
            grade = 'C';
        } else {
            grade = 'F';
        }
    }

    void showDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Student student = new Student(1, "Rahim");
        student.updateGrade(85.0);
        student.showDetails();
    }
}