package oopj;
// import java.util.Scanner;
// public class prac {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the array:");
//         int size = sc.nextInt();
//         int number[] = new int[size];
        
//         System.out.println("Enter " + size + " elements:");
//         for (int i = 0; i < size; i++) {
//             number[i] = sc.nextInt();
//         }
//         System.out.println("The elements of the array are: ");
//         for (int i = 0; i < size; i++) {
//             System.out.println(number[i]);
//         }
//         sc.close();
//     }
// }


// class Parent_c {
//     void show(){
//         System.out.println("this is parent class");
//     }
// }
// class pract extends Parent_c {
//     void show(){
//         System.out.println("this is a child class");
    
//         }

//  }
   

// public class prac {

//     public static void main(String[] args) {
//         Parent_c pc = new Parent_c();
//         Parent_c pcs = new pract();
//         pc.show();
//         pcs.show();
//     }
// }
    


// this super kekword
// class pay {
//     String name = "this is parent class";
// }
// class pay2 extends pay{
//     String name = "this is a child class";

//     void display(){
//         System.out.println("parent class :" + super.name);
//         System.out.println("child class :" + this.name);
//     }
// }
// public class prac {

//     public static void main(String[] args) {
//         pay2 pp = new pay2();
//         pp.display();

//     }
// }


abstract class vehical {
    abstract void stop();
    abstract void start();
    void fuel(){
        System.out.println("go to the petrol pump a take fuel");
    }
}
class car extends vehical{
    @Override
    void stop(){
        System.out.println("using clutch and breack to stop the car");
    }
    @Override
    void start(){
        System.out.println("using the key to start the car");
    }
}
class bike extends vehical{
    @Override
    void stop(){
        System.out.println("same here in bike to remove gare and take clutch and break");
    }
    @Override
    void start(){
        System.out.println("apply the kick and self button for start");
    }
}

public class prac{
    public static void main(String[] args) {
        vehical vcl = new car();
        vcl.start();
        vcl.stop();
        vcl.fuel();



        vehical bk = new bike();
        bk.start();
        bk.stop();
        bk.fuel();
            
        };
    }
