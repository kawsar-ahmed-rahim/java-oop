// 11.Create a Student class with fields: name, rollNumber, and an array marks[] for 5 subjects.

// Add methods:

// calculateAverage() → returns average marks.

// calculateGrade() → returns grade (A/B/C/D/F) based on average.

// In main, assign marks directly and display name, roll number, average, and grade

class Student {
    String name;
    int rollNumber;
    int[] marks = new int[5];

    double calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / (double) marks.length;
    }

    char calculateGrade() {
        double avg = calculateAverage();
        if (avg >= 80) return 'A';
        else if (avg >= 70) return 'B';
        else if (avg >= 60) return 'C';
        else if (avg >= 50) return 'D';
        else return 'F';
    }
}

public class GradeManagement {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Rahim";
        student.rollNumber = 101;
        student.marks = new int[]{85, 78, 92, 66, 74};

        System.out.println("Name: " + student.name);
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("Average: " + student.calculateAverage());
        System.out.println("Grade: " + student.calculateGrade());
    }
}
