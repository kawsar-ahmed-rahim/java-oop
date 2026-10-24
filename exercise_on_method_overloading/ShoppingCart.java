// Exercise 11: Shopping Bill
// Create a class ShoppingCart and overload calculateBill().
// calculateBill(double price);
// calculateBill(double price, int quantity);
// calculateBill(double price, int quantity, double discount);

class ShoppingCart {
    double calculateBill(double price) {
        return price;
    }

    double calculateBill(double price, int quantity) {
        return price * quantity;
    }

    double calculateBill(double price, int quantity, double discount) {
        double total = price * quantity;
        return total - (total * discount / 100);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        System.out.println(cart.calculateBill(100));
        System.out.println(cart.calculateBill(100, 3));
        System.out.println(cart.calculateBill(100, 3, 10));
    }
}
