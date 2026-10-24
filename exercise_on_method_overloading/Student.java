// Exercise 3: Display Information
// Create a class Student and overload a method called display().
// It should support:
// display(String name);
// display(String name, int age);
// display(String name, int age, double cgpa);

class Student {
    void display(String name) {
        System.out.println("Name: " + name);
    }

    void display(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    void display(String name, int age, double cgpa) {
        System.out.println("Name: " + name + ", Age: " + age + ", CGPA: " + cgpa);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display("Rahim");
        s.display("Karim", 20);
        s.display("Sakib", 22, 3.75);
    }
}
