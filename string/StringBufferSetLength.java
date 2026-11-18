class StringBufferSetLength {
    StringBuffer sb;

    StringBufferSetLength(String text) {
        sb = new StringBuffer(text);
    }

    void show() {
        sb.setLength(3);
        System.out.println(sb);
    }

    public static void main(String[] args) {
        StringBufferSetLength obj = new StringBufferSetLength("Hello");
        obj.show();
    }
}
