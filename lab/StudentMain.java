class Student {
    int id;
    String name;
    String email;
    double result;

    public void show() {
        System.out.println("Data of the Student:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("email: " + email);
        System.out.println("Result: " + result);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Rahim";
        s1.email = "student@email.com";
        s1.result = 4.00;
        s1.show();
    }
}
