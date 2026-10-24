// 14.Create a Book class with fields: title, author, isIssued (boolean).
// 
// Add methods:
// 
// issueBook() → sets isIssued = true if not already issued.
// 
// returnBook() → sets isIssued = false.
// 
// In main, create a book, issue it, try issuing again, return it, then issue again.

// use constructor

class Book {
    String title;
    String author;
    boolean isIssued;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println(title + " has been issued.");
        } else {
            System.out.println(title + " is already issued.");
        }
    }

    void returnBook() {
        isIssued = false;
        System.out.println(title + " has been returned.");
    }
}

public class BookIssueSystemConstructor {
    public static void main(String[] args) {
        Book book = new Book("Effective Java", "Joshua Bloch");

        book.issueBook();  // issues successfully
        book.issueBook();  // already issued
        book.returnBook(); // returned
        book.issueBook();  // issued again
    }
}
