class Student {
    String name;
    int id;
    String email;
    double result;

    Student(String name, int id, String email, double result){
        this.name = name;
        this.id = id;
        this.email = email;
        this.result = result;
    }

    void displayInfo(){
        System.out.println("Data of the Student:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("email: " + email);
        System.out.println("Result: " + result);
        System.out.println("--------------------");
    }

}

public class StudentConstructor{
    public static void main(String args[]){
        Student s1 = new Student("Rahim", 1, "rahim@example.com", 2.10);
        Student s2 = new Student("kahim", 1, "kahim@example.com", 2.10);

        s1.displayInfo();
        s2.displayInfo();
    }
}