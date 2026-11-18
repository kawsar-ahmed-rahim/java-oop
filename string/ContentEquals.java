class ContentEquals {
    String text;

    ContentEquals(String text) {
        this.text = text;
    }

    void check() {
        System.out.println(text.contentEquals("Hello"));
        System.out.println(text.contentEquals(new StringBuffer("Hello")));
    }

    public static void main(String[] args) {
        ContentEquals obj = new ContentEquals("Hello");
        obj.check();
    }
}
