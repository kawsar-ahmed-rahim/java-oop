class CodePointAt {
    String text;

    CodePointAt(String text) {
        this.text = text;
    }

    int run() {
        return text.codePointAt(0);
    }

    public static void main(String[] args) {
        CodePointAt obj = new CodePointAt("Hello");
        System.out.println("Code point: " + obj.run());
    }
}
