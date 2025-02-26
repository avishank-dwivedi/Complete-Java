package fundamental;


 

// public class Bank{
//     public static void main(String[] args) {
        
//         int [] array = {2,2,3,3,};
//         // Check if arguments are passed
//         if (array.length > 0) {
//             System.out.println("Command-line arguments:");
            
            
//             // Loop through and print each argument
//             for (int i = 0; i < array.length; i++) {
//                 System.out.println("Argument " + i + ": " + array[i]);
//             }
//         } else {
//             System.out.println("No command-line arguments found.");
//         }
//     }
// }


    

//    // Car class jaisa pichle example mein tha
// class Car {
//     String make;
//     String model;
//     int year;

//     public Car(String make, String model, int year) {
//         this.make = make;
//         this.model = model;
//         this.year = year;
//     }

//     public void displayInfo() {
//         System.out.println("Car Make: " + make);
//         System.out.println("Car Model: " + model);
//         System.out.println("Car Year: " + year);
//     }
// }

// public class Bank {
//     public static void main(String[] args) {
//         // Car ka object banate hain
//         Car myCar = new Car("Toyota", "Corolla", 2020);

//         // yaha 'myCar' ek reference variable hai
//         myCar.displayInfo(); // Output: Car Make: Toyota, Model: Corolla, Year: 2020
        
//         // Correct: Define 'anotherReference' with the correct type
//         Car anotherReference = myCar;

//         // Ab 'anotherReference' bhi wahi object point karega jo 'myCar' kar raha tha
//         anotherReference.displayInfo(); // Output: Same as above
        
//         // Dono references same object ko refer kar rahe hain
//         System.out.println(myCar == anotherReference); // Output: true
//     }
// }



    





// 1. Static Nested Class

class OuterClass {
    static int outerStaticVar = 10;
     int outerInstanceVar = 20;
    
        static class StaticNestedClass {
            void display() {
          //      Can access static members of outer class
               System.out.println("Outer static variable: " + outerStaticVar);
                
            //    Cannot access non-static members
            //   System.out.println("Outer instance variable: " + outerInstanceVar);  // This would cause an error
        }
    }
}


// // Inner Class (Non-static Nested Class)

// class outerClass {
//     static int outerStaticVar = 10;
//     int outerInstanceVar = 20;
    
//     class InnerClass {
//         void display() {
//             // Can access both static and non-static members of outer class
//             System.out.println("Outer instance variable: " + outerInstanceVar);

//             System.out.println("Outer static variable: " + outerStaticVar);
//         }
//     }
// }
