class StringBufferSubSequence {
    StringBuffer sb;

    StringBufferSubSequence(String text) {
        sb = new StringBuffer(text);
    }

    void show() {
        System.out.println(sb.subSequence(0, 5));
    }

    public static void main(String[] args) {
        StringBufferSubSequence obj = new StringBufferSubSequence("Hello World");
        obj.show();
    }
}
