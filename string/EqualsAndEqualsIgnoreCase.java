class EqualsAndEqualsIgnoreCase {
    String a, b;

    EqualsAndEqualsIgnoreCase(String a, String b) {
        this.a = a;
        this.b = b;
    }

    void check() {
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
    }

    public static void main(String[] args) {
        EqualsAndEqualsIgnoreCase obj =
            new EqualsAndEqualsIgnoreCase("Java", "JAVA");
        obj.check();
    }
}
