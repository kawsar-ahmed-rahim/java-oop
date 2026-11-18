class CharAt {
    String text;

    CharAt(String text) {
        this.text = text;
    }

    char run() {
        return text.charAt(1);
    }

    public static void main(String[] args) {
        CharAt obj = new CharAt("Hello");
        System.out.println("Char at 1: " + obj.run());
    }
}
