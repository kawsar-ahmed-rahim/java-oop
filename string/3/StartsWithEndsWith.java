class StartsWithEndsWith {
    String text;

    StartsWithEndsWith(String text) {
        this.text = text;
    }

    void check() {
        System.out.println(text.startsWith("Hello"));
        System.out.println(text.endsWith("World"));
    }

    public static void main(String[] args) {
        StartsWithEndsWith obj = new StartsWithEndsWith("Hello World");
        obj.check();
    }
}
