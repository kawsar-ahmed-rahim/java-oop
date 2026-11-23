public class OUTBOUND {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};

        try {
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception caught!");
        }

        System.out.println("Program continues...");
    }
}