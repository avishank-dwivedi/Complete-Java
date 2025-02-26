package fundamental;
/* 
import java.util.Scanner;

public class conditional4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>18){
            System.out.println("adult");

        }else{
            System.out.println("not adult");
        }
    }   
}
*/

import java.util.Scanner;

public class conditional4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        if(button ==1){
            System.out.println("hello");

        }else if (button ==2) {
            System.out.println("namaste");
        }
        else if(button==3){
            System.out.println("bonjour");
        }
        else{
            System.out.println("invalid button");
        }

        sc.close();
    }   
}
