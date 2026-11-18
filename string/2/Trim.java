class Trim {
    String text;

    Trim(String text) {
        this.text = text;
    }

    String run() {
        return text.trim();
    }

    public static void main(String[] args) {
        Trim obj = new Trim("   Hello   ");
        System.out.println("Result: " + obj.run());
    }
}
