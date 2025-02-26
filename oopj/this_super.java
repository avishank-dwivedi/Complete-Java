package oopj;


class Parent {
    String Name = "Parent Class";
}

// child class
class child extends Parent {
    String Name = "Child Class";

    void display() {
        System.out.println("Parent Name: " + super.Name); // Access parent variable
        System.out.println("Child Name: " + this.Name);  // Access child variable
    }
}

public class this_super {
    public static void main(String[] args) {
        child obj = new child();
        obj.display();
    }
}


// class Student {
//     String name;

//     Student(String name) {
//         this.name = name; // Resolving naming conflict
//     }

//     void display() {
//         System.out.println("Name: " + this.name);
//     }
// }

// public class this_super {
//     public static void main(String[] args) {
//         Student student = new Student("Avishank");
//         student.display(); // Output: Name: Avishank
//     }
// }

// class Studen {
//     private String name;
//     private int age;

//     public Studen() {
//         this("Unknown", 0); // Calls the parameterized constructor.
//     }

//     public Studen(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     public void display() {
//         System.out.println("Name: " + this.name + ", Age: " + this.age);
//     }
// }

// public class this_super {
//     public static void main(String[] args) {
//         Studen studenn = new Studen();
//         studenn.display();
//     }
// }


class Example {
    static int value;

    static {
        value = 100; // Initialize static variable
        System.out.println("Static block executed. Value: " + value);
    }
}

public class this_super {
    public static void main(String[] args) {
        System.out.println("Main method executed.");
        System.out.println("Accessing Example.value: " + Example.value); // Reference triggers static block
        
        
        
        
    }
}
