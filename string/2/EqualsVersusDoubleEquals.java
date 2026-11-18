class EqualsVersusDoubleEquals {
    String a = "Java";
    String b = new String("Java");

    void check() {
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }

    public static void main(String[] args) {
        EqualsVersusDoubleEquals obj = new EqualsVersusDoubleEquals();
        obj.check();
    }
}
