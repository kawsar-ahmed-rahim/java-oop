class StringBufferIndexOf {
    StringBuffer sb;

    StringBufferIndexOf(String text) {
        sb = new StringBuffer(text);
    }

    void show() {
        System.out.println(sb.indexOf("one"));
        System.out.println(sb.indexOf("one", 1));
    }

    public static void main(String[] args) {
        StringBufferIndexOf obj = new StringBufferIndexOf("one two one");
        obj.show();
    }
}
