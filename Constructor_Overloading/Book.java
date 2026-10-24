// Exercise 6: Book
// Create a class Book.
// Variables:
// String title;
// String author;
// double price;
// Constructor overloading:
// Book(String title)
// Book(String title, String author)
// Book(String title, String author, double price)
// Method overloading:
// void discount(double percentage)
// void discount(double percentage, double extraDiscount)
// void discount(int fixedAmount)
// Requirements:
// •
// First method applies percentage discount.
// •
// Second method applies percentage + extra discount.
// •
// Third method deducts a fixed amount.

class Book {
    String title;
    String author;
    double price;

    Book(String title) {
        this.title = title;
        this.author = "Unknown";
        this.price = 0;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void discount(double percentage) {
        price = price - (price * percentage / 100);
        System.out.println("Price after percentage discount: " + price);
    }

    void discount(double percentage, double extraDiscount) {
        price = price - (price * percentage / 100);
        price = price - extraDiscount;
        System.out.println("Price after percentage + extra discount: " + price);
    }

    void discount(int fixedAmount) {
        price = price - fixedAmount;
        System.out.println("Price after fixed discount: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics");
        Book b2 = new Book("OOP Concepts", "Rahim");
        Book b3 = new Book("Data Structures", "Rahim", 2000.0);

        b3.discount(10);
        b3.discount(10.0, 50.0);
        b3.discount(100);
    }
}