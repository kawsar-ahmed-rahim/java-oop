class StringLength {
    String text;

    StringLength(String text) {
        this.text = text;
    }

    int getLength() {
        return text.length();
    }

    public static void main(String[] args) {
        StringLength obj = new StringLength("Hello World");
        System.out.println("Length: " + obj.getLength());
    }
}
