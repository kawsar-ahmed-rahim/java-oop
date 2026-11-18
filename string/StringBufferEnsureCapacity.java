class StringBufferEnsureCapacity {
    StringBuffer sb;

    StringBufferEnsureCapacity(String text) {
        sb = new StringBuffer(text);
    }

    void show() {
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
    }

    public static void main(String[] args) {
        StringBufferEnsureCapacity obj = new StringBufferEnsureCapacity("Hello");
        obj.show();
    }
}
