class CodePointBefore {
    String text;

    CodePointBefore(String text) {
        this.text = text;
    }

    int run() {
        return text.codePointBefore(1);
    }

    public static void main(String[] args) {
        CodePointBefore obj = new CodePointBefore("Hello");
        System.out.println("Code point: " + obj.run());
    }
}
