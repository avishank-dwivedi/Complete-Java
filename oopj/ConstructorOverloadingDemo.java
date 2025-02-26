package oopj;

class Student {
    String name;
    int age;
    String course;
    
    // Default Constructor
    Student() {
        this.name = "Unknown";
        this.age = 0;
        this.course = "Not Enrolled";
    }

    // Constructor with one parameter
    Student(String name) {
        this.name = name;
        this.age = 0;
        this.course = "Not Enrolled";
    }

    // Constructor with two parameters
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.course = "Not Enrolled";
    }

    // Constructor with three parameters
    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        // Using different constructors
        Student student1 = new Student();
        Student student2 = new Student("Avishank");
        Student student3 = new Student("Avishank", 20);
        Student student4 = new Student("Avishank", 20, "Data Science");

        // Printing information directly
        System.out.println("Name: " + student1.name + ", Age: " + student1.age + ", Course: " + student1.course);
        System.out.println("Name: " + student2.name + ", Age: " + student2.age + ", Course: " + student2.course);
        System.out.println("Name: " + student3.name + ", Age: " + student3.age + ", Course: " + student3.course);
        System.out.println("Name: " + student4.name + ", Age: " + student4.age + ", Course: " + student4.course);
    }
}

// class avi{
//     String name ;
//     int Class;
//     String sub;
    

//     avi(String name ,String sub){
//         this.name = name ;
//         this.Class = 0;
//         this.sub = sub;
//     }
//     avi(String name){
//         this.name = name;
//         this.Class = 0;
//         this.sub = "unknown";
//     }
//     avi(String name , int Class){
//         this.name = name;
//         this.Class = Class;
//         this.sub = "unknown";
//     }

// }
// public class ConstructorOverloadingDemo {

//     public static void main(String[] args) {
        
//         avi avi1 = new avi("avishank", "java");
//         avi avi2 = new avi("avishank");
//         avi avi3 = new avi("avishank", 11);

//         System.out.println( "name" + avi1.name + ", Class Level: " + avi1.Class + ", Subject: " + avi1.sub);
//         System.out.println("Name: " + avi2.name + ", Class Level: " + avi2.Class + ", Subject: " + avi2.sub);
//         System.out.println("Name: " + avi3.name + ", Class Level: " + avi3.Class + ", Subject: " + avi3.sub);
       
        
        
//     }
// }