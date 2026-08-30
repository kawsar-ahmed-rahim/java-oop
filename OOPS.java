//! object-class
// class(blueprint)
class Pen {
    String color;// red,black //!property //!data
    String type; //gel-pen,ball-pen

    public void write(){ //! method //! members
        System.out.println("our pen");
    }
    public void printColor(){ 
        System.out.println(this.color);// this will tell the function which object is called it/ which object trying to access
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);

    }
}


// object (instance)
public class OOPS {
    public static void main(String args[]){
        Pen pen1 = new Pen();//object making 
        pen1.color = "blue";// object accessing
        pen1.type = "gel-pen";

        Pen pen2 = new Pen();//object making
        pen2.color = "red";// object accessing
        pen2.type = "ball-pen";

        pen1.printColor();
        pen2.printColor();

        pen1.write();//method calling


        Student s1 = new Student();
        s1.name = "rahim";
        s1.age = 24;

        s1.printInfo();
    }
}