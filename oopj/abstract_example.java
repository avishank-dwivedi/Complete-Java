 package oopj;
// abstract class parent{
//     public parent(){
//         System.out.println("mai base ka constructor hu");
//     }
//     public void sayhello(){
//         System.out.println("hello");

//     }
//     abstract public void greet();
// }
// class child2 extends parent{
//     @Override
//     public void greet(){
//         System.out.println("good morning");
//     }
// }
// public class abstract_example {
//     public static void main(String[] args){
//         child2 c = new child2();
//         c.sayhello();
//         c.greet();
//     }
    
// }


abstract class Vehicle {
    abstract void start(); // Abstract method
    abstract void stop();  // Abstract method

    void fuel() { // Concrete method
        System.out.println("Vehicle needs fuel to run.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key or push button.");
    }

    @Override
    void stop() {
        System.out.println("Car stops using brakes.");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a kick or self-start.");
    }

    @Override
    void stop() {
        System.out.println("Bike stops using brakes.");
    }
}

public class abstract_example {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start(); // Outputs: Car starts with a key or push button.
        myCar.fuel();  // Outputs: Vehicle needs fuel to run.
        myCar.stop();  // Outputs: Car stops using brakes.

        Vehicle myBike = new Bike();
        myBike.start(); // Outputs: Bike starts with a kick or self-start.
        myBike.fuel();  // Outputs: Vehicle needs fuel to run.
        myBike.stop();  // Outputs: Bike stops using brakes.
    }
}
