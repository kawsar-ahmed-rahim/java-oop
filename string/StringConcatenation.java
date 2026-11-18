class StringConcatenation {
    String first, last;

    StringConcatenation(String first, String last) {
        this.first = first;
        this.last = last;
    }

    String fullName() {
        return first + " " + last + " " + 25;
    }

    public static void main(String[] args) {
        StringConcatenation obj =
            new StringConcatenation("John", "Smith");
        System.out.println(obj.fullName());
    }
}
