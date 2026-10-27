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
    private final int bookId;
    private String title;
    private String author;
    private final int totalCopies;
    private int availableCopies;     

    public LibraryBook(int bookId, String title, String author,
                       int totalCopies, int availableCopies) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title must not be empty");
        }
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Author must not be empty");
        }
        if (totalCopies <= 0) {
            throw new IllegalArgumentException("Total copies must be greater than zero");
        }
        if (availableCopies < 0 || availableCopies > totalCopies) {
            throw new IllegalArgumentException(
                    "Available copies must be between 0 and total copies");
        }
        this.bookId = bookId;
        this.title = title.trim();
        this.author = author.trim();
        this.totalCopies = totalCopies;
        this.availableCopies = availableCopies;
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
        if (title == null || title.trim().isEmpty()) {
            System.out.println("Error: title cannot be empty.");
        } else {
            this.title = title.trim();
        }
    }

    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            System.out.println("Error: author cannot be empty.");
        } else {
            this.author = author.trim();
        }
    }

    public void borrowBook() {
        if (availableCopies == 0) {
            System.out.println("Borrow rejected: no copies of \"" + title
                    + "\" are available.");
        } else {
            availableCopies--;
            System.out.println("Book borrowed. Available: " + availableCopies
                    + "/" + totalCopies);
        }
    }

    public void returnBook() {
        if (availableCopies == totalCopies) {
            System.out.println("Return rejected: all copies are already in the library.");
        } else {
            availableCopies++;
            System.out.println("Book returned. Available: " + availableCopies
                    + "/" + totalCopies);
        }
    }
}

public class LibraryBorrowing {
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook(1, "Clean Code", "Robert C. Martin", 2, 2);
        System.out.println(book.getBookId() + " | " + book.getTitle() + " by "
                + book.getAuthor() + " | available "
                + book.getAvailableCopies() + "/" + book.getTotalCopies());

        System.out.println();
        book.borrowBook();
        book.borrowBook();
        book.borrowBook();    
        System.out.println();
        book.returnBook();
        book.returnBook();
        book.returnBook();     

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
