// 15.Create an Employee class with fields: name, id, daysPresent, totalWorkingDays.

// Add methods:

// markAttendance(int days) → increases daysPresent.

// attendancePercentage() → returns (daysPresent / totalWorkingDays) * 100.

// In main, create two employees, update attendance for a month, and display percentage.

//use constructor
class Employee {
    String name;
    int id;
    int daysPresent;
    int totalWorkingDays;

    Employee(String name, int id, int totalWorkingDays) {
        this.name = name;
        this.id = id;
        this.totalWorkingDays = totalWorkingDays;
        this.daysPresent = 0;
    }

    void markAttendance(int days) {
        daysPresent += days;
    }

    double attendancePercentage() {
         return (daysPresent / (double) totalWorkingDays) * 100;
    }
}

public class EmployeeAttendanceConstructor {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Rahim", 1, 22);
        Employee emp2 = new Employee("Karim", 2, 22);

        emp1.markAttendance(20);
        emp2.markAttendance(18);

        System.out.println(emp1.name + " (ID: " + emp1.id + ") Attendance: " + emp1.attendancePercentage() + "%");
        System.out.println(emp2.name + " (ID: " + emp2.id + ") Attendance: " + emp2.attendancePercentage() + "%");
    }
}
