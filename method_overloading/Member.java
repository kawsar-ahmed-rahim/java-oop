// Exercise 8: Library Member
// Create a class Member with overloaded constructors:
// 1. Constructor with memberId.
// 2. Constructor with memberId and name.
// 3. Constructor with memberId, name, and membershipType.
// 4. Constructor with memberId, name, membershipType, and joiningDate.

class Member {
    int memberId;
    String name;
    String membershipType;
    String joiningDate;

    Member(int memberId) {
        this.memberId = memberId;
        this.name = "Unknown";
        this.membershipType = "Unknown";
        this.joiningDate = "Unknown";
    }

    Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.membershipType = "Unknown";
        this.joiningDate = "Unknown";
    }

    Member(int memberId, String name, String membershipType) {
        this.memberId = memberId;
        this.name = name;
        this.membershipType = membershipType;
        this.joiningDate = "Unknown";
    }

    Member(int memberId, String name, String membershipType, String joiningDate) {
        this.memberId = memberId;
        this.name = name;
        this.membershipType = membershipType;
        this.joiningDate = joiningDate;
    }

    void showDetails() {
        System.out.println("Member ID: " + memberId);
        System.out.println("Name: " + name);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Joining Date: " + joiningDate);
    }

    public static void main(String[] args) {
        Member member = new Member(101, "Rahim", "Premium", "2024-01-15");
        member.showDetails();
    }
}
