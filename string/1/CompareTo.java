class CompareTo {
    String a, b;

    CompareTo(String a, String b) {
        this.a = a;
        this.b = b;
    }

    int compare() {
        return a.compareTo(b);
    }

    public static void main(String[] args) {
        CompareTo obj = new CompareTo("apple", "banana");
        System.out.println(obj.compare());
    }
}
