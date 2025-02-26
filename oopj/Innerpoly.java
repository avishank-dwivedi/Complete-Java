package oopj;

// // runtime polymorphysam (method overriden)

// class poly {
//     void sound_animal(){
//         System.out.println("dinchakk dinchakk");
//     }

// }
// class kholi extends poly {
//     @Override
//     void sound_animal(){
        
//     System.out.println("agreee");
//    }  
// }
// class kon_kholi extends poly{
//     @Override
//     void sound_animal(){
//         System.out.println("main kholi");

//     }
// }


// public class Innerpoly {
//     public static void main(String[] args) {
//         poly pp = new poly();
//         poly kho = new kholi();
//         poly k_kno = new kon_kholi();

//         pp.sound_animal();
//         kho.sound_animal();
//         k_kno.sound_animal();
        
        
//     }
    
// }


// compiole time polymorphysam

class math {

    public int add(int a , int b){
        return a + b ;
    }
    public int add(int a , int b , int c){
        return a+b+c;
    }
    public double add(double a , double b){
        return a + b ;
    }   
    
}
public class Innerpoly {
   public static void main(String[] args) {
    math mth = new math();
    System.out.println("the int of two num :" +mth.add(6, 5));
    System.out.println("the double of two num : "+mth.add(6.4, 6.6));
    System.out.println("the int of three num :"+mth.add(4, 5, 4));


    

   }
}