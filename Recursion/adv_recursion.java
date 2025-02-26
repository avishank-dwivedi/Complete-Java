package Recursion;
/* 
// preint all permutation of a string
public class adv_recursion {
    
    
    public static void printPermutation(String str , String permutation){
        if(str.length() ==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0 ; i<str.length();i++){
            char currchar = str.charAt(i);
            String newStr = str.substring(0, i)+ str.substring(i+1);
            printPermutation(newStr, permutation+currchar);
        }
    }
    public static void main(String[] args) {
       String str = "abc";
       printPermutation(str, "");
    }
    
}


//count total path in a maze to move from (0,0) to (n,m)

public class adv_recursion {
    
    
    public static int counntPaths(int i , int j , int n  , int m){
        if(i==n || j==m){
            return 0;
        }
        if(i == n-1  && j==n-1){
            return 1;
        }
        
        //move downwords
        int downwords = counntPaths(i+1 , j , n , m);

        //move right
        int rightPaths = counntPaths(i, j+1, n, m);

        return downwords + rightPaths ;

    }
       
    public static void main(String[] args) {
       int n =3 , m=3;
       int totalPaths = counntPaths(0,0,n,m);
       System.out.println(totalPaths);
    }
    
}
*/

public class adv_recursion {
     public static int callguest(int n){
        if(n==1){
            return 1;
        }
        // single
        int ways1 = callguest(n-1);

        //pair
        int ways2 =(n-1)*callguest( n-2);

        return ways1+ways2;
     }
     public static void main(String[] args) {
        int n= 4;
        System.out.println(callguest(n));
    }

}
 
    
 

 


