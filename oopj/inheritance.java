package oopj;

abstract class aninmal{
   abstract void walk();
}
class horse extends aninmal{
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}
class chicken extends aninmal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}

public class inheritance {
    public static void main(String[] args) {
        horse horse = new horse();
        horse.walk();
        chicken ck = new chicken();
        ck.walk();

        
    }
}


// interface animal {
//     public void walk();
    
// }
// class horse implements animal{
//     @Override
//     public void walk(){
//         System.out.println("walk on 4 legs");
//     }

// }
// public class inheritance {

//     public static void main(String[] args) {
//         horse horse = new horse();
//         horse.walk();
//     }
// }