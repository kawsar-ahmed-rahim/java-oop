class Join {
    String sep;

    Join(String sep) {
        this.sep = sep;
    }

    String combine() {
        return String.join(sep, "Java", "OOP", "Code");
    }

    public static void main(String[] args) {
        Join obj = new Join("-");
        System.out.println(obj.combine());
    }
}
