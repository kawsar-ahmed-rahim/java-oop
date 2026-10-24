// Exercise 4: Library
// •
// Constructors:
// 1.
// Default constructor → "Empty Library".
// 2.
// Constructor with library name.
// •
// Method Overloading:
// o
// addBook(String title)
// o
// addBook(String title, String author)
// o
// addBook(String title, String author, int year)
// •
// Normal Methods:
// o
// showLibraryDetails() → print library name and books count.
// o
// totalBooks() → return number of books.

class Library {
    String libraryName;
    int bookCount;

    Library() {
        this.libraryName = "Empty Library";
        this.bookCount = 0;
    }

    Library(String libraryName) {
        this.libraryName = libraryName;
        this.bookCount = 0;
    }

    void addBook(String title) {
        bookCount += 1;
    }

    void addBook(String title, String author) {
        bookCount += 1;
    }

    void addBook(String title, String author, int year) {
        bookCount += 1;
    }

    void showLibraryDetails() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Books Count: " + bookCount);
    }

    int totalBooks() {
        return bookCount;
    }

    public static void main(String[] args) {
        Library library = new Library("City Library");
        library.addBook("Java Basics");
        library.addBook("OOP Concepts", "Rahim");
        library.addBook("Data Structures", "Rahim", 2020);
        library.showLibraryDetails();
        System.out.println("Total Books: " + library.totalBooks());
    }
}