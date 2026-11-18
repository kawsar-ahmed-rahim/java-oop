class StringBufferGetChars {
    StringBuffer sb;

    StringBufferGetChars(String text) {
        sb = new StringBuffer(text);
    }

    void show() {
        char[] dest = new char[5];
        sb.getChars(6, 11, dest, 0);
        System.out.println(dest);
    }

    public static void main(String[] args) {
        StringBufferGetChars obj = new StringBufferGetChars("Hello World");
        obj.show();
    }
}
