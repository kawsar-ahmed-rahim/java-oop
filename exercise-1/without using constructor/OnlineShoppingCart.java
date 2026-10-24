// 12.Create a Product class with fields: name, price, quantity.
// 
// Add methods:
// 
// totalPrice() → returns price * quantity.
// 
// In main, create an array of 3 products, calculate each product’s total price, and sum all for the cart total.



class Product {
    String name;
    double price;
    int quantity;

    double totalPrice() {
        return price * quantity;
    }
}

public class OnlineShoppingCart {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.name = "Pen";
        p1.price = 10;
        p1.quantity = 5;

        Product p2 = new Product();
        p2.name = "Notebook";
        p2.price = 50;
        p2.quantity = 3;

        Product p3 = new Product();
        p3.name = "Bag";
        p3.price = 800;
        p3.quantity = 1;

        double total1 = p1.totalPrice();
        double total2 = p2.totalPrice();
        double total3 = p3.totalPrice();

        System.out.println(p1.name + " -> Total: " + total1);
        System.out.println(p2.name + " -> Total: " + total2);
        System.out.println(p3.name + " -> Total: " + total3);

        double cartTotal = total1 + total2 + total3;

        System.out.println("Cart Total: " + cartTotal);
    }
}