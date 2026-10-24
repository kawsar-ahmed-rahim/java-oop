// 15.Create an Employee class with fields: name, id, daysPresent, totalWorkingDays.

// Add methods:

// markAttendance(int days) → increases daysPresent.

// attendancePercentage() → returns (daysPresent / totalWorkingDays) * 100.

// In main, create two employees, update attendance for a month, and display percentage.

class Employee {
    String name;
    int id;
    int daysPresent;
    int totalWorkingDays;


    void markAttendance(int days) {
        daysPresent += days;
    }

    double attendancePercentage() {
        return (daysPresent / (double) totalWorkingDays) * 100;
    }
}

public class EmployeeAttendance {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.name = "rahim";
        emp1.id = 1;
        emp1.daysPresent = 12;

        emp2.name = "kahim";
        emp2.id = 2;
        emp2.daysPresent = 22;

        emp1.markAttendance(20);
        emp2.markAttendance(18);

        System.out.println(emp1.name + " (ID: " + emp1.id + ") Attendance: " + emp1.attendancePercentage() + "%");
        System.out.println(emp2.name + " (ID: " + emp2.id + ") Attendance: " + emp2.attendancePercentage() + "%");
    }
}
