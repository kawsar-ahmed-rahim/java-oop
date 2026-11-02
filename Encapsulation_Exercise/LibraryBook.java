/*
 * ==================== QUESTION ====================
 * Exercise 10: Library Book Borrowing System
 * Create a class named LibraryBook containing bookId, title, author, totalCopies, and
 *     availableCopies.
 * Requirements:
 * 1. Declare all attributes as private.
 * 2. Initialize them using a constructor.
 * 3. Provide getter methods for all attributes.
 * 4. Do not provide setters for bookId, totalCopies, or availableCopies.
 * 5. Allow title and author to be modified using validated setters.
 * 6. Create borrowBook() to decrease available copies.
 * 7. Create returnBook() to increase available copies.
 * 8. Ensure available copies never exceed total copies and never become negative.
 * 9. Reject borrow requests when no copies are available.
 * =================================================
 */


class LibraryBook {

    private int bookId;
    private String title;
    private String author;
    private int totalCopies;
    private int availableCopies;

    LibraryBook(int bookId, String title, String author, int totalCopies, int availableCopies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.totalCopies = totalCopies;

        if (availableCopies >= 0 && availableCopies <= totalCopies) {
            this.availableCopies = availableCopies;
        } else {
            this.availableCopies = 0;
            System.out.println("Error: Invalid available copies!");
        }
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setTitle(String title) {
        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Error: Invalid book title!");
        }
    }

    public void setAuthor(String author) {
        if (author != null && !author.trim().isEmpty()) {
            this.author = author;
        } else {
            System.out.println("Error: Invalid author name!");
        }
    }

    public void borrowBook() {
        if (availableCopies > 0) {
            availableCopies--;
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Error: No copies available!");
        }
    }

    public void returnBook() {
        if (availableCopies < totalCopies) {
            availableCopies++;
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Error: All copies are already available!");
        }
    }

    public void displayInfo() {
        System.out.println("Book ID: " + getBookId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Total Copies: " + getTotalCopies());
        System.out.println("Available Copies: " + getAvailableCopies());
    }

    public static void main(String[] args) {

        LibraryBook book = new LibraryBook(101, "Java Programming", "James Gosling", 10, 3);

        System.out.println("Initial Book Information:");
        book.displayInfo();

        System.out.println("\nAfter Borrowing Books:");

        book.borrowBook();
        book.borrowBook();
        book.borrowBook();
        book.displayInfo();

        System.out.println("\nTrying to Borrow Another Book:");

        book.borrowBook();

        System.out.println("\nAfter Returning a Book:");

        book.returnBook();
        book.displayInfo();

        System.out.println("\nUpdating Book Information:");

        book.setTitle("Advanced Java");
        book.setAuthor("John Smith");
        book.displayInfo();
    }
}
