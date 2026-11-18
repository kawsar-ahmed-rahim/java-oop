class IndexOf {
    String text;

    IndexOf(String text) {
        this.text = text;
    }

    int run() {
        return text.indexOf('o');
    }

    public static void main(String[] args) {
        IndexOf obj = new IndexOf("Hello World");
        System.out.println("Index: " + obj.run());
    }
}
