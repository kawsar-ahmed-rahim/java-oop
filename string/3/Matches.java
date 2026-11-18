class Matches {
    String text;

    Matches(String text) {
        this.text = text;
    }

    boolean run() {
        return text.matches("[a-z]+[0-9]+");
    }

    public static void main(String[] args) {
        Matches obj = new Matches("hello123");
        System.out.println("Matches: " + obj.run());
    }
}
