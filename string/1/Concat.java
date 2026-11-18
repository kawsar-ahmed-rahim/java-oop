class Concat {
    String a, b;

    Concat(String a, String b) {
        this.a = a;
        this.b = b;
    }

    String join() {
        return a.concat(b);
    }

    public static void main(String[] args) {
        Concat obj = new Concat("Hello ", "World");
        System.out.println(obj.join());
    }
}
