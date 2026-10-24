//! POLYMORPHISM
//! function overloading(return type or parameter type or number of parameter should be different)
//! compile time

class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(this.name);
    }

    public void printInfo(int age) {
        System.out.println(this.age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}



// object (instance)
public class POLYMORPHISM {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "rahim";
        s1.age= 22;

        s1.printInfo(s1.age);
        s1.printInfo(s1.name);



        //! copy constructor
        Student s1 = new Student();
        s1.name = "rahim";
        s1.age = 22;
        Student s2 = new Student(s1);
        s2.printInfo();
    }
}