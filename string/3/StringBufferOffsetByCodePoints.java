class StringBufferOffsetByCodePoints {
    StringBuffer sb;

    StringBufferOffsetByCodePoints(String text) {
        sb = new StringBuffer(text);
    }

    void show() {
        System.out.println(sb.offsetByCodePoints(0, 3));
    }

    public static void main(String[] args) {
        StringBufferOffsetByCodePoints obj = new StringBufferOffsetByCodePoints("Hello");
        obj.show();
    }
}
