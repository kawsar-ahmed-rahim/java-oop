class ToLowerCase {
    String text;

    ToLowerCase(String text) {
        this.text = text;
    }

    String run() {
        return text.toLowerCase();
    }

    public static void main(String[] args) {
        ToLowerCase obj = new ToLowerCase("HELLO World");
        System.out.println("Lower: " + obj.run());
    }
}
