class ReplaceAll {
    String text;

    ReplaceAll(String text) {
        this.text = text;
    }

    String run() {
        return text.replaceAll("[aeiou]", "*");
    }

    public static void main(String[] args) {
        ReplaceAll obj = new ReplaceAll("Hello World");
        System.out.println("Result: " + obj.run());
    }
}
