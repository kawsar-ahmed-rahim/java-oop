class CodePointCount {
    String text;

    CodePointCount(String text) {
        this.text = text;
    }

    int run() {
        return text.codePointCount(0, 5);
    }

    public static void main(String[] args) {
        CodePointCount obj = new CodePointCount("Hello World");
        System.out.println("Count: " + obj.run());
    }
}
