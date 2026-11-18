class Replace {
    String text;

    Replace(String text) {
        this.text = text;
    }

    String run() {
        return text.replace('o', '0');
    }

    public static void main(String[] args) {
        Replace obj = new Replace("Hello World");
        System.out.println("Result: " + obj.run());
    }
}
