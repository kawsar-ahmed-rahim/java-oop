class Split {
    String text;

    Split(String text) {
        this.text = text;
    }

    void show() {
        for (String s : text.split(","))
            System.out.print(s + " ");
        System.out.println();
        for (String s : text.split(",", 2))
            System.out.print(s + " | ");
    }

    public static void main(String[] args) {
        Split obj = new Split("a,b,c,d");
        obj.show();
    }
}
