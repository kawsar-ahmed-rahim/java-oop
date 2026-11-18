class StringBufferTrimToSize {
    StringBuffer sb;

    StringBufferTrimToSize(String text) {
        sb = new StringBuffer(text);
    }

    void show() {
        sb.trimToSize();
        System.out.println(sb.capacity());
    }

    public static void main(String[] args) {
        StringBufferTrimToSize obj = new StringBufferTrimToSize("Hello");
        obj.show();
    }
}
