class StringBufferLastIndexOf {
    StringBuffer sb;

    StringBufferLastIndexOf(String text) {
        sb = new StringBuffer(text);
    }

    void show() {
        System.out.println(sb.lastIndexOf("one"));
        System.out.println(sb.lastIndexOf("one", 5));
    }

    public static void main(String[] args) {
        StringBufferLastIndexOf obj = new StringBufferLastIndexOf("one two one");
        obj.show();
    }
}
