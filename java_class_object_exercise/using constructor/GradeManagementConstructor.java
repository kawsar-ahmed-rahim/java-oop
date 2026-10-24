// 11. Create a Student class with fields:
// name, rollNumber, and an array marks[] for 5 subjects.
//
// Add methods:
// calculateAverage() → returns average marks.
// calculateGrade() → returns grade (A/B/C/D/F) based on average.
//
// In main, assign marks directly and display name,
// roll number, average, and grade.
//
// Use constructor

class Student {

    String name;
    int rollNumber;
    int[] marks;

    // Constructor
    Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Calculate average
    double calculateAverage() {
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        return sum / (double) marks.length;
    }

    // Calculate grade
    char calculateGrade() {
        double avg = calculateAverage();

        if (avg >= 80)
            return 'A';
        else if (avg >= 70)
            return 'B';
        else if (avg >= 60)
            return 'C';
        else if (avg >= 50)
            return 'D';
        else
            return 'F';
    }
}

public class GradeManagementConstructor {

    public static void main(String[] args) {

        Student student = new Student(
            "Rahim",
            101,
            new int[]{85, 78, 92, 66, 74}
        );

        System.out.println("Name: " + student.name);
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("Average: " + student.calculateAverage());
        System.out.println("Grade: " + student.calculateGrade());
    }
}