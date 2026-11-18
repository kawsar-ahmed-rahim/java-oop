class ToUpperCase {
    String text;

    ToUpperCase(String text) {
        this.text = text;
    }

    String run() {
        return text.toUpperCase();
    }

    public static void main(String[] args) {
        ToUpperCase obj = new ToUpperCase("hello World");
        System.out.println("Upper: " + obj.run());
    }
}
