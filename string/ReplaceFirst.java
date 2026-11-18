class ReplaceFirst {
    String text;

    ReplaceFirst(String text) {
        this.text = text;
    }

    String run() {
        return text.replaceFirst("[aeiou]", "*");
    }

    public static void main(String[] args) {
        ReplaceFirst obj = new ReplaceFirst("Hello World");
        System.out.println("Result: " + obj.run());
    }
}
