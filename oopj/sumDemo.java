package oopj;

 class sumd {
    private int x, y, z;

    public void input() {
        x = 10;
        y = 15;
    } 

    public void sum() {
        z = x + y;
    }

    public void print_data() {
        System.out.println("answer is " + z);
    }
}

public class sumDemo{
    public static void main(String[] args) {
        sumd object = new sumd();
        object.input();
        object.sum();
        object.print_data();
    }
}
/*


class dotdemo{
    int x,y,z;
    public void sum(){
        z=x+y;
    }
    public void show(){
      System.out.println("the anser is"+ z);
    }

}
class demo{
    public static void main(String []args){
        dotdemo object = new dotdemo();
        dotdemo object2 = new dotdemo();
        object.x = 10 ;
        object.y = 15 ;
        object2.x=5;
        object2.y= 10;
        object.sum();
        object.show();
        object2.sum();
        object2.show();
    } 
}

*/