package oopj;




// polymorphysam 
//Compile-Time Polymorphism (Method Overloading)

class MathOperations {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
}

public class polymorphysam {
    public static void main(String[] args) {
        MathOperations math = new MathOperations(); // Create an object of MathOperations

        // Call the overloaded methods
        System.out.println("Sum of two integers: " + math.add(5, 3));           // Output: 8
        System.out.println("Sum of three integers: " + math.add(5, 3, 2));      // Output: 10
        System.out.println("Sum of two doubles: " + math.add(5.5, 3.3));        // Output: 8.8
    }
}


// //Runtime Polymorphism (Method Overriding)
// class nimal {
//     void sound() {
//         System.out.println("Animal makes a sound.");
//     }
// }

// class Dog extends nimal {
//     @Override
//     void sound() {
//         System.out.println("Dog barks.");
//     }
// }

// public class polymorphysam {
//     public static void main(String[] args) {
//         nimal animal = new Dog(); // Upcasting
//         animal.sound(); // Calls Dog's overridden method
//         nimal animal1 = new nimal();
//         animal1.sound();
//     }
// }
