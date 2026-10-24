// 4.Create a Book class with fields: title, author, price.
// •
// In the main method, create three Book objects and assign values directly.
// •
// Display all book details using a method showBook().

class Book {
    String title;
    String author;
    double price;

    void showBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("-----------------------");
    }
}

public class BookInformation {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "The Alchemist";
        b1.author = "Paulo Coelho";
        b1.price = 350;

        Book b2 = new Book();
        b2.title = "1984";
        b2.author = "George Orwell";
        b2.price = 420;

        Book b3 = new Book();
        b3.title = "Clean Code";
        b3.author = "Robert C. Martin";
        b3.price = 800;

        b1.showBook();
        b2.showBook();
        b3.showBook();
    }
}
