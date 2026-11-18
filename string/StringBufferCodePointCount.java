class StringBufferCodePointCount {
    StringBuffer sb;

    StringBufferCodePointCount(String text) {
        sb = new StringBuffer(text);
    }

    void show() {
        System.out.println(sb.codePointCount(0, 5));
    }

    public static void main(String[] args) {
        StringBufferCodePointCount obj = new StringBufferCodePointCount("Hello World");
        obj.show();
    }
}
