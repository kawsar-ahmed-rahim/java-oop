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

// ANSWER
public class Main {
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook(1, "Clean Code", "Robert C. Martin", 2, 2);
        System.out.println(book.getBookId() + " | " + book.getTitle() + " by "
                + book.getAuthor() + " | available "
                + book.getAvailableCopies() + "/" + book.getTotalCopies());

        System.out.println();
        book.borrowBook();
        book.borrowBook();
        book.borrowBook();     // rejected: none left

        System.out.println();
        book.returnBook();
        book.returnBook();
        book.returnBook();     // rejected: would exceed total copies

        System.out.println();
        book.setTitle("");
        book.setAuthor("   ");
        book.setTitle("Clean Code (2nd printing)");
        book.setAuthor("R. C. Martin");
        System.out.println(book.getTitle() + " by " + book.getAuthor()
                + " | available " + book.getAvailableCopies()
                + "/" + book.getTotalCopies());
    }
}
