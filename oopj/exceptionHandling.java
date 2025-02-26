 package oopj;

// public class exceptionHandling {
//     public static void main(String[] args) {
//         try {
//             int result = divide(10, 0); // This will throw an exception
//             System.out.println("Result: " + result);
//         } catch (ArithmeticException e) {
//             System.out.println("Error: Division by zero is not allowed.");
//         } finally {
//             System.out.println("Finally block always executes.");
//         }
//     }

//     public static int divide(int a, int b) throws ArithmeticException {
//         return a / b;
//     }
// }


public class exceptionHandling {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // Division by zero, causes ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            System.out.println("This block is always executed.");
        }
    }
}
