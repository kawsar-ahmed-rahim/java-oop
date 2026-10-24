//! single level inheritance
class Shape { // base class/ parent class
    public void area(){
        System.out.println("displays area");
    }
}

class Triangle extends Shape {// subclass/child class
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

public class INHERITENCE{
    public static void main(String args[]){
        Triangle t1 = new Triangle();
        
    }
}

//! 2.multi level inheritence
class Shape { // base class/ parent class
    public void area(){
        System.out.println("displays area");
    }
}

class Triangle extends Shape {// subclass/child class
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

public class INHERITENCE{
    public static void main(String args[]){
        Triangle t1 = new Triangle();
        
    }
}


//! 3.multi level inheritence
class Shape { // base class/ parent class
    public void area(){
        System.out.println("displays area");
    }
}

class Triangle extends Shape {// subclass/child class
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }

}
class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}

public class INHERITENCE{
    public static void main(String args[]){
        Triangle t1 = new Triangle();
        
    }
}

//! 4.hybrid inheritence