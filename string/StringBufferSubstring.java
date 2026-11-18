class StringBufferSubstring {
    StringBuffer sb;

    StringBufferSubstring(String text) {
        sb = new StringBuffer(text);
    }

    void show() {
        System.out.println(sb.substring(6));
        System.out.println(sb.substring(0, 5));
    }

    public static void main(String[] args) {
        StringBufferSubstring obj = new StringBufferSubstring("Hello World");
        obj.show();
    }
}
