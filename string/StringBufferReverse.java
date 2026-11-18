class StringBufferReverse {
    StringBuffer sb;

    StringBufferReverse(String text) {
        sb = new StringBuffer(text);
    }

    void show() {
        sb.reverse();
        System.out.println(sb);
    }

    public static void main(String[] args) {
        StringBufferReverse obj = new StringBufferReverse("Hello");
        obj.show();
    }
}
