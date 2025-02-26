package Recursion;
/* 
import java.util.*;

public class functions {
    public static void printMyName(String name) {
        System.out.println(name);
        return;

        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name  = sc.next();

        printMyName(name);
        sc.close();
    }
    
}


import java.util.*;

public class functions {
    public static int CalculateNumbers(int a  , int  b) {
        int sum =a +b;
        return sum;
    }

    public static void main(String []args ) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();

        int sum = CalculateNumbers(a, b);
        System.out.println("sum of 2 numbers :" + sum);
        sc.close();
    }
    
}


import java.util.*;

public class functions {
    public static int CalculateProduct(int a  , int  b) {
        
        return a*b;

        
    }

    public static void main(String []args ) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();

        
        System.out.println("product of 2 numbers :" +CalculateProduct(a, b));
        sc.close();
    }
    
}
*/


import java.util.*;

public class functions {
    public static int CalculateFactorial(int n ) {
        int factorial =1;
        for(int i=n ; i>=1; i--){
            factorial= factorial*i;
        }
        
        return factorial;

        
    }

    public static void main(String []args ) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        

        
        
        System.out.println(CalculateFactorial(n));
        sc.close();
    }
    
}