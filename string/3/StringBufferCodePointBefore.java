class StringBufferCodePointBefore {
    StringBuffer sb;

    StringBufferCodePointBefore(String text) {
        sb = new StringBuffer(text);
    }

    void show() {
        System.out.println(sb.codePointBefore(1));
    }

    public static void main(String[] args) {
        StringBufferCodePointBefore obj = new StringBufferCodePointBefore("Hello");
        obj.show();
    }
}
