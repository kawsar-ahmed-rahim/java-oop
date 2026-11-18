class GetChars {
    String text;

    GetChars(String text) {
        this.text = text;
    }

    void copy() {
        char[] dest = new char[5];
        text.getChars(6, 11, dest, 0);
        System.out.println(dest);
    }

    public static void main(String[] args) {
        GetChars obj = new GetChars("Hello World");
        obj.copy();
    }
}
