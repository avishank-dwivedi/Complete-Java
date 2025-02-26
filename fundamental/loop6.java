package fundamental;
/*
 
 
public class loop6 {
    public static void main(String[] args) {
        for(int counter = 0 ; counter < 11 ; counter++){
            System.out.println("hello avi");
            System.out.println(counter);
        }
    }
}



public class loop6 {
    public static void main(String[] args) {
        int i =0 ;
        while (i < 10) {
            i= i+1;

        System.out.println(i);    
            
        }
    }
}


public class loop6 {
    public static void main(String[] args) {
        int i =0 ;
        do {
            System.out.println(i);
            i= i+1;
        }
            while(i<10);

          
            
        }
    }
*/

import java.util.Scanner;

public class loop6 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

       for(int i =0; i<11 ; i++){
       System.out.println(i*n);    
            
        }
        sc.close();
    }
}