class RegionMatches {
    String a, b;

    RegionMatches(String a, String b) {
        this.a = a;
        this.b = b;
    }

    void check() {
        System.out.println(a.regionMatches(6, b, 0, 5));
        System.out.println(a.regionMatches(true, 6, "WORLD", 0, 5));
    }

    public static void main(String[] args) {
        RegionMatches obj = new RegionMatches("Hello World", "World");
        obj.check();
    }
}
