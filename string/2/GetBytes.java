class GetBytes {
    String text;

    GetBytes(String text) {
        this.text = text;
    }

    void show() {
        for (byte b : text.getBytes())
            System.out.print(b + " ");
    }

    public static void main(String[] args) {
        GetBytes obj = new GetBytes("ABC");
        obj.show();
    }
}
