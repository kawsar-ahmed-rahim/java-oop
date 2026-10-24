// 12.Create a Product class with fields: name, price, quantity.
// 
// Add methods:
// 
// totalPrice() → returns price * quantity.
// 
// In main, create an array of 3 products, calculate each product’s total price, and sum all for the cart total.

// use constructor

class Product {
    String name;
    double price;
    int quantity;

    Product(String name,
    double price,
    int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    double totalPrice() {
        return price * quantity;
    }
}

public class OnlineShoppingCartConstructor {
    public static void main(String[] args) {
        Product p1 = new Product("Pen", 10, 5);
       

        Product p2 = new Product("Notebook", 50, 3);
        

        Product p3 = new Product("Bag", 700, 1);
       

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