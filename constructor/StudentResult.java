// Exercise 12: Student Result
// Create a class StudentResult.
// Variables:
// String name;
// double marks1;
// double marks2;
// double marks3;
// Create a constructor.
// Methods:
// double calculateAverage()
// String getGrade()
// void displayResult()
// Grade system:
// 80–100 = A+
// 70–79 = A
// 60–69 = A-
// 50–59 = B
// 40–49 = C
// Below 40 = F
// Exercise

class StudentResult {
    String name;
    double marks1;
    double marks2;
    double marks3;

    // Constructor
    StudentResult(String name, double marks1, double marks2, double marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    // Calculate average
    double calculateAverage() {
        return (marks1 + marks2 + marks3) / 3;
    }

    // Get grade
    String getGrade() {
        double average = calculateAverage();

        if (average >= 80) {
            return "A+";
        } 
        else if (average >= 70) {
            return "A";
        } 
        else if (average >= 60) {
            return "A-";
        } 
        else if (average >= 50) {
            return "B";
        } 
        else if (average >= 40) {
            return "C";
        } 
        else {
            return "F";
        }
    }

    // Display result
    void displayResult() {
        System.out.println("Name: " + name);
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);
        System.out.println("Average: " + calculateAverage());
        System.out.println("Grade: " + getGrade());
    }

    public static void main(String[] args) {
        StudentResult s1 = new StudentResult("Rahim", 85, 78, 90);

        s1.displayResult();
    }
}