class ValueOf {
    int num;

    ValueOf(int num) {
        this.num = num;
    }

    String convert() {
        return String.valueOf(num);
    }

    public static void main(String[] args) {
        ValueOf obj = new ValueOf(100);
        System.out.println(obj.convert() + 1);
    }
}
