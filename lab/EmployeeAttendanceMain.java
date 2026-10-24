// 15.
// Employee Attendance
// 
// Create an Employee class with fields: name, id, daysPresent, totalWorkingDays.
// 
// Add methods:
// 
// markAttendance(int days) → increases daysPresent.
// 
// attendancePercentage() → returns (daysPresent / totalWorkingDays) * 100.
// 
// In main, create two employees, update attendance for a month, and display percentage.

class Employee {
    String name;
    int id;
    int daysPresent;
    int totalWorkingDays;
    
}

void markAttendance(int days) {
	daysPresent += days;
}

void attendancePercentage(){
	return (daysPresent / (double)totalWorkingDays) * 100;
}

public class EmployeeAttendanceMain {
	public static void main(String args[]){
	
	Employee e1 = new Employee();
	Employee e2 = new Employee();
	
	e1.name = "rahim";
	e1.id = 1;
	e1.daysPresent = 12;
	e1.totalWorkingDays = 11;

	e2.name = "kahim";
	e2.id = 2;
	e2.daysPresent = 9;
	e2.totalWorkingDays = 8;

	system.out.println("Name:" + e1.name + "ID :" + e1.id + "Present days: " + e1.markAttendance() +"percentage" + e1.attendancePercentage()+ "%")
	


}
}