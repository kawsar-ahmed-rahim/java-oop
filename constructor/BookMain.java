
// Exercise 8: Book
// Create a class Book.
// Variables:
// String title;
// String author;
// double price;
// Create a constructor.
// Add methods:
// void displayBook()
// void discountPrice(double discount)
// boolean isExpensive()
// isExpensive() should return true if the book price is greater than 1000.

class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    void discountPrice(double discount) {
        price = price - discount;
    }

    boolean isExpensive() {
        return price > 1000;
    }
}

public class BookMain {
    public static void main(String[] args) {

        Book book = new Book("Java Programming", "James Gosling", 1200);

        book.displayBook();

        book.discountPrice(200);

        System.out.println("After discount:");
        book.displayBook();

        System.out.println("Is expensive? " + book.isExpensive());
    }
}

