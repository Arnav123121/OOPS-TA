public class Main {
    public static void main(String[] args) {
        try {
            int result = 108 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            System.out.println("Finally block always run!!.");
        }
    }
}
