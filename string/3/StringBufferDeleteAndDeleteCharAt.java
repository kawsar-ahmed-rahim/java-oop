class StringBufferDeleteAndDeleteCharAt {
    StringBuffer sb;

    StringBufferDeleteAndDeleteCharAt(String text) {
        sb = new StringBuffer(text);
    }

    void show() {
        sb.delete(0, 6);
        sb.deleteCharAt(0);
        System.out.println(sb);
    }

    public static void main(String[] args) {
        StringBufferDeleteAndDeleteCharAt obj = new StringBufferDeleteAndDeleteCharAt("Hello World");
        obj.show();
    }
}
