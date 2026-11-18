class Contains {
    String text;

    Contains(String text) {
        this.text = text;
    }

    boolean run() {
        return text.contains("World");
    }

    public static void main(String[] args) {
        Contains obj = new Contains("Hello World");
        System.out.println("Contains: " + obj.run());
    }
}
