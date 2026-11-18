class StringBufferLengthAndCapacity {
    StringBuffer sb;

    StringBufferLengthAndCapacity(String text) {
        sb = new StringBuffer(text);
    }

    void show() {
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }

    public static void main(String[] args) {
        StringBufferLengthAndCapacity obj = new StringBufferLengthAndCapacity("Hello");
        obj.show();
    }
}
