class Student {
    private String name;
    private int age;
    private double cgpa;

    public Student(String name, int age, double cgpa) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }

    public double getCgpa() {
        return cgpa;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void displayInfo() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("CGPA : " + this.cgpa);
        System.out.println();
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("rahim", 20, 2.00);
        
        System.out.println("Student Info : (set by constructor):");
        s1.displayInfo();
        
        s1.setName("kawsar");
        s1.setAge(21);
        s1.setCgpa(1.66);

        System.out.println("Student Info : (set by setter function):");
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("CGPA: " + s1.getCgpa());
        System.out.println();
    }
}