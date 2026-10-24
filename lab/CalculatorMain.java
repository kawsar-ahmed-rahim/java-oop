// overloading methods
class Calculator {


int add(int a, int b){
	return a+b;
}
int add(int a, int b, int c){
	return a+b+c;
}

double add(double a , double b){
return a+b;
}


}






public class CalculatorMain {
    public static void main(String args[]) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(5, 10));
        System.out.println(c1.add(5.5, 10.5));
        System.out.println(c1.add(5, 10, 4));
    }
}
