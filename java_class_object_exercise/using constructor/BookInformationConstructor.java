// 4.Create a Book class with fields: title, author, price.
// •
// In the main method, create three Book objects and assign values directly.
// •
// Display all book details using a method showBook().

// use constructor

class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void showBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("-----------------------");
    }
}

public class BookInformationConstructor {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho", 450);

        Book b2 = new Book("1984", "George Orwell", 453);

        Book b3 = new Book("Clean Code", "Robert C. Martin", 200);

        b1.showBook();
        b2.showBook();
        b3.showBook();
    }
}
