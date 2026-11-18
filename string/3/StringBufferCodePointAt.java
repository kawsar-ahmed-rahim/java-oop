class StringBufferCodePointAt {
    StringBuffer sb;

    StringBufferCodePointAt(String text) {
        sb = new StringBuffer(text);
    }

    void show() {
        System.out.println(sb.codePointAt(0));
    }

    public static void main(String[] args) {
        StringBufferCodePointAt obj = new StringBufferCodePointAt("Hello");
        obj.show();
    }
}
