// Exercise 15: Challenge — Library Book
// Create a class LibraryBook.
// Variables:
// String title;
// String author;
// boolean borrowed;
// The constructor should initialize:
// borrowed = false;
// Methods:
// void borrowBook()
// void returnBook()
// void displayStatus()
// Rules:
// •
// A borrowed book cannot be borrowed again.
// •
// A returned book cannot be returned again.

class LibraryBook {
    String title;
    String author;
    boolean borrowed;

    LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    void borrowBook() {
        if (!borrowed) {
            borrowed = true;
            System.out.println(title + " has been borrowed");
        } else {
            System.out.println(title + " is already borrowed");
        }
    }

    void returnBook() {
        if (borrowed) {
            borrowed = false;
            System.out.println(title + " has been returned");
        } else {
            System.out.println(title + " was not borrowed");
        }
    }

    void displayStatus() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Borrowed: " + borrowed);
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Java OOP", "Rahim");
        book.displayStatus();
        book.borrowBook();
        book.borrowBook();
        book.returnBook();
        book.returnBook();
    }
}