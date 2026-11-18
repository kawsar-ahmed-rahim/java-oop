class StringConversionToString {
    int id;
    String name;

    StringConversionToString(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }

    public static void main(String[] args) {
        StringConversionToString obj =
            new StringConversionToString(1, "Ali");
        System.out.println(obj);
    }
}
