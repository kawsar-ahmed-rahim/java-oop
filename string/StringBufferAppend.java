class StringBufferAppend {
    StringBuffer sb;

    StringBufferAppend(String text) {
        sb = new StringBuffer(text);
    }

    void show() {
        sb.append(" World").append(1);
        System.out.println(sb);
    }

    public static void main(String[] args) {
        StringBufferAppend obj = new StringBufferAppend("Hello");
        obj.show();
    }
}
