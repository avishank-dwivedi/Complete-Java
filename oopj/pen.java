package oopj;

class oopj {
    String type ;
    String color;

    public void write(){
        System.out.println("write something");
    }
    public void printing(){
        System.out.println(this.color);
        System.out.println(this.type);

    }
}
class Student{
    String name ;
    int age;

    public void print_info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

}


public class pen {
    public static void main(String[] args) {
        oopj pen1 = new oopj();
        pen1.type = "gel";
        pen1.color = "green";

        oopj pen2 = new oopj();
        pen2.type = "ballpen";
        pen2.color ="black";

        pen1.printing();
        pen2.printing();
        

        pen1.write();

        Student s1 = new Student();
        s1.name="abhi";
        s1.age=18;

        Student s2 = new Student();
        s2.name ="sytam";
        s2.age = 16;

        s1.print_info();

       }
}
       
/*


class oopj{
    String name ;
    int age;

    public void print_info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    oopj(String name ,int age){
        this.name = name;
        this.age = age;
    }
}

public class pen {

    public static void main(String[] args) {
        oopj s1 = new oopj("avishank ", 20);
        s1.print_info();
        
    }
}
      


 // inheritence
import java.util .*;
import bank.*;
    
class shape{
    public void area(){
        System.out.println("display area");
        }

    }
    class triangle extends shape{
        public void area(int l , int h){
            System.out.println(1/2*l*h);
        }
    }
    class circle extends shape{
        public void area (int r){
            System.out.println((3.14)*r*r);
        }
    }




public class pen {

    public static void main(String[] args) {

       Bank.account account1 = new Bank .account();
       account1.name = "customer";
        
    }
}
*/