// 9.Create a LibraryMember class with fields: memberName, membershipType, booksBorrowed.

// Assign values directly in main.

// Write methods borrowBook() and returnBook() to update booksBorrowed.

// Display updated status.

class LibraryMember {
    String memberName;
    String membershipType;
    int booksBorrowed;

    void borrowBook() {
        booksBorrowed++;
        System.out.println(memberName + " borrowed a book. Total borrowed: " + booksBorrowed);
    }

    void returnBook() {
        if (booksBorrowed > 0) {
            booksBorrowed--;
            System.out.println(memberName + " returned a book. Total borrowed: " + booksBorrowed);
        } else {
            System.out.println(memberName + " has no books to return.");
        }
    }
}

public class LibraryMemberMain {
    public static void main(String[] args) {
        LibraryMember member = new LibraryMember();
        member.memberName = "Rahim";
        member.membershipType = "Premium";
        member.booksBorrowed = 0;
     


        member.borrowBook();
        member.borrowBook();
        member.returnBook();

        System.out.println("Final status for " + member.memberName + " (" + member.membershipType + "): " + member.booksBorrowed + " books borrowed");
    }
}
