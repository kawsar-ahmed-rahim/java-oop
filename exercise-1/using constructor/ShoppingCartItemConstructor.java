// 8.Create a CartItem class with fields: itemName, unitPrice, quantity.

// Assign values directly in main.

// Write a method to calculate and display the total cost.

class CartItem {
    String itemName;
    double unitPrice;
    int quantity;
    CartItem( String itemName,
    double unitPrice,
    int quantity) {
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    void calculateTotalCost() {
        double total = unitPrice * quantity;
        System.out.println("Item: " + itemName);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
    }
}

public class ShoppingCartItemConstructor {
    public static void main(String[] args) {
        CartItem item = new CartItem("Notebook", 50, 3);

        item.calculateTotalCost();
    }
}
