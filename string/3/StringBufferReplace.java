class StringBufferReplace {
    StringBuffer sb;

    StringBufferReplace(String text) {
        sb = new StringBuffer(text);
    }

    void show() {
        sb.replace(6, 11, "Java");
        System.out.println(sb);
    }

    public static void main(String[] args) {
        StringBufferReplace obj = new StringBufferReplace("Hello World");
        obj.show();
    }
}
