class IsEmpty {
    String text;

    IsEmpty(String text) {
        this.text = text;
    }

    boolean run() {
        return text.isEmpty();
    }

    public static void main(String[] args) {
        IsEmpty obj = new IsEmpty("");
        System.out.println("Empty: " + obj.run());
    }
}
