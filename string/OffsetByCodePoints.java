class OffsetByCodePoints {
    String text;

    OffsetByCodePoints(String text) {
        this.text = text;
    }

    int run() {
        return text.offsetByCodePoints(0, 3);
    }

    public static void main(String[] args) {
        OffsetByCodePoints obj = new OffsetByCodePoints("Hello");
        System.out.println("Index: " + obj.run());
    }
}
