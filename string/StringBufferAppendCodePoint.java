class StringBufferAppendCodePoint {
    StringBuffer sb;

    StringBufferAppendCodePoint(String text) {
        sb = new StringBuffer(text);
    }

    void show() {
        sb.appendCodePoint(65);
        System.out.println(sb);
    }

    public static void main(String[] args) {
        StringBufferAppendCodePoint obj = new StringBufferAppendCodePoint("Hello");
        obj.show();
    }
}
