public class Methods {

    // Method without return value
    static void greet() {
        System.out.println("Welcome to Java Programming!");
    }

    // Method with return value
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        greet();

        int result = add(10, 20);

        System.out.println("Sum = " + result);
    }
}
