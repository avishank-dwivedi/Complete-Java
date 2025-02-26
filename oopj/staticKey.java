package oopj;

// class Counter {
//     static int count = 0; // Static variable
    
//         Counter() {
//             count++;
//         }
    
//         public static void displayCount() {
//             System.out.println("Count: " + count);
//     }
// }

// public class staticKey {
//     public static void main(String[] args) {
//         Counter c1 = new Counter();
//         Counter c2 = new Counter();
//         Counter c3 = new Counter();

//         // All instances share the same static variable
//         Counter.displayCount(); // Output: Count: 3
//     }
// }



class Calculator {
    // Static method
    public static int add(int a, int b){
        return a + b;
    }
}

public class staticKey {
    public static void main(String[] args) {
        // Call static method without creating an object
        System.out.println("Sum: " + Calculator.add(5, 3)); // Output: Sum: 8
    }
}
