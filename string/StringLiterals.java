class StringLiterals {
    String text = "Hello";

    void show() {
        System.out.println(text);
        System.out.println("Java".length());
    }

    public static void main(String[] args) {
        StringLiterals obj = new StringLiterals();
        obj.show();
    }
}
