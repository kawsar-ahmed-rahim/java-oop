class StringBufferCharAtAndSetCharAt {
    StringBuffer sb;

    StringBufferCharAtAndSetCharAt(String text) {
        sb = new StringBuffer(text);
    }

    void show() {
        System.out.println(sb.charAt(1));
        sb.setCharAt(1, 'a');
        System.out.println(sb);
    }

    public static void main(String[] args) {
        StringBufferCharAtAndSetCharAt obj = new StringBufferCharAtAndSetCharAt("Hello");
        obj.show();
    }
}
