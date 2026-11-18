import java.util.Locale;

class Format {
    String name;
    double value;

    Format(String name, double value) {
        this.name = name;
        this.value = value;
    }

    void show() {
        System.out.println(String.format("Name: %s", name));
        System.out.println(String.format(Locale.US, "Value: %.2f", value));
    }

    public static void main(String[] args) {
        Format obj = new Format("Ali", 3.14159);
        obj.show();
    }
}
