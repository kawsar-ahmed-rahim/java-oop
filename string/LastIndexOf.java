class LastIndexOf {
    String text;

    LastIndexOf(String text) {
        this.text = text;
    }

    int run() {
        return text.lastIndexOf('o');
    }

    public static void main(String[] args) {
        LastIndexOf obj = new LastIndexOf("Hello World");
        System.out.println("Last index: " + obj.run());
    }
}
