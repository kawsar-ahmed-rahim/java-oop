class SubSequence {
    String text;

    SubSequence(String text) {
        this.text = text;
    }

    CharSequence run() {
        return text.subSequence(0, 5);
    }

    public static void main(String[] args) {
        SubSequence obj = new SubSequence("Hello World");
        System.out.println("Result: " + obj.run());
    }
}
