package oopj;
/* 
class kuchbhi{
    int sum;
    int mutip;

    public void print(){
        System.out.println(this.sum);
        System.out.println(this.mutip);
    }


    kuchbhi(int a , int b ){
        this.sum = a+b;
        this.mutip = a*b;
          
    }
    public static void main(String[] args) {
        kuchbhi kc = new kuchbhi( 5  , 3);
        kc.print();

    }
}

*/


class kuchbhi {
 int sum;
 int mutip;



 
 public void isko_chapo(){
    System.out.println(this.mutip);
 }
}

class atcha extends kuchbhi{
 int a;
 int b ;

 atcha(){
    this.sum=a+b;
    this.mutip=a+b;
 }
public void chapo(){
    System.out.println(sum);
 }  
}
class inneratcha{
public static void main(String[] args) {

    atcha at = new atcha();
    at.a=4;
    at.b=5;
   
    
    at.chapo();
    
 }
        


}