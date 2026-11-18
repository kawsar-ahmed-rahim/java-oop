class StringBufferInsert {
    StringBuffer sb;

    StringBufferInsert(String text) {
        sb = new StringBuffer(text);
    }

    void show() {
        sb.insert(5, " Java");
        System.out.println(sb);
    }

    public static void main(String[] args) {
        StringBufferInsert obj = new StringBufferInsert("Hello World");
        obj.show();
    }
}
