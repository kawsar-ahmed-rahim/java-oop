// Exercise 4: Book
// Create a class Book with overloaded constructors:
// 1. Accepts only title.
// 2. Accepts title and author.
// 3. Accepts title, author, and price.
// 4. Accepts title, author, price, and year.
// Add a method displayBook() to show details.

class Book {
    String title;
    String author;
    double price;
    int year;

    Book(String title) {
        this.title = title;
        this.author = "Unknown";
        this.price = 0;
        this.year = 0;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0;
        this.year = 0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = 0;
    }

    Book(String title, String author, double price, int year) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
    }

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Book book = new Book("Java OOP", "Rahim", 500, 2024);
        book.displayBook();
    }
}
