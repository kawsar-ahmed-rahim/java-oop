class Substring {
    String text;

    Substring(String text) {
        this.text = text;
    }

    String run() {
        return text.substring(6);
    }

    public static void main(String[] args) {
        Substring obj = new Substring("Hello World");
        System.out.println("Substring: " + obj.run());
    }
}
