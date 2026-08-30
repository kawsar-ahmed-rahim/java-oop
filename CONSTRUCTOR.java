//! constructor

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);

    }

    //!constructor:construct of object

    //1.non-parameterized constructor
    Student() { 
        System.out.println("constructor called");
    }

    //2.parameterized constructor
    Student(String name, int age) {
        this.name = name; //this.object = parameter
        this.age = age;
    }

    //3.copy constructor
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}


// object (instance)
public class CONSTRUCTOR {
    public static void main(String args[]){
        Student s1 = new Student("rahim", 22);
        s1.printInfo();



        //! copy constructor
        Student s1 = new Student();
        s1.name = "rahim";
        s1.age = 22;
        Student s2 = new Student(s1);
        s2.printInfo();
    }
}