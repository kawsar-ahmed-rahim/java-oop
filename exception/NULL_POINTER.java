public class NULL_POINTER {
    public static void main(String[] args) {

        String name = null;

        try {
            System.out.println(name.length());
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception caught!");
        }

        System.out.println("Program continues...");
    }
}