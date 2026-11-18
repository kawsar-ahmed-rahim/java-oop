class ToCharArray {
    String text;

    ToCharArray(String text) {
        this.text = text;
    }

    void show() {
        for (char c : text.toCharArray())
            System.out.print(c + " ");
    }

    public static void main(String[] args) {
        ToCharArray obj = new ToCharArray("Java");
        obj.show();
    }
}
