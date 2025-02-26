package Recursion;

/*
public class recursion {
    public static void printNumbe(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printNumbe(n-1);
        
    }
    public static void main(String[] args) {
        int n= 5 ;
        printNumbe(n); // n=5

    }
}


public class recursion {
    public static void printNumbe(int n) {
        if(n == 6) {
            return;
        }
        System.out.println(n);
        printNumbe(n+1);
        
    }
    public static void main(String[] args) {
        int n= 1 ;
        printNumbe(n); // n=5

    }
}
*/

/* 

//sum of number

public class recursion {
    public static void printNumbe(int i ,int n ,int sum) {

        if(i == n ){

            sum +=i;
   
            System.out.println(sum);
            return;
        }
            sum += i;
            printNumbe(i+1 ,n , sum);
            System.out.println(i);
        } 
    
    public static void main(String[] args) {
        
        
        printNumbe(1 , 5 , 0); // n=5

    }
}


public class recursion {
    public static int calcfactorial(int n) {

        if(n == 1  || n == 0 ) {
           return  1;

        }
        int fact_nm1 = calcfactorial(n - 1);
        int fact_n = n * fact_nm1;
        return fact_n ;
            
    } 
    
    public static void main(String[] args) {
        int n = 5;
        int ans = calcfactorial(n);
        System.out.println(ans);
    }
}
    

    public class recursion {
        public static void fibonacci(int a ,int b ,int n) {
            if( n== 0){
                return;  
            }

            int c = a+b;
            System.out.println(c);
            fibonacci(b , c , n-1);
            
            
        }
        
        public static void main(String[] args) {
            int a  = 0 ,b = 1 ;
            System.out.println(a);
            System.out.println(b);
            int n= 7;
            fibonacci(a , b, n-2);
        }
    }
    

    
    public class recursion {
        public static int calPower(int x ,int  n) {
            if( n== 0){
                return 1;  
            }
            if( x== 0 ){
                return 0;

            }

            int xPower1 = calPower( x ,  n-1);
            int xPown = x* xPower1;
            return xPown;
        }
        public static void main(String[] args) {
            int x = 2 , n  = 5 ;
            int ans = calPower(x , n);
            System.out.println(ans);
        }
    }

    

    // reverse the string

import java.util.Scanner;


    public class recursion {
        public static void rev(String str , int idx){
            if(idx == 0){
                System.out.println(str.charAt(idx));
                return;
            }
            System.out.print(str.charAt(idx));
            rev(str ,idx-1);
        } 
    
        public static void main(String[] args) {
            Scanner sc = new Scanner( System.in);
            String str = sc.nextLine();
            rev(str , str.length()-1);

            

            }



        }
    
// find string 



import java.util.Scanner;


    public class recursion {
        public static int first = -1;
        public static int last = -1;

        public static void findoccurance(String str , int idx , char element){
            if(idx == str.length()){
                System.out.println(first);
                System.out.println(last);
                return;
            }
            char  currChar = str.charAt(idx);
            if(currChar == element){
                if(first == -1){
                    first = idx ;

                }
                else {
                    last =idx;
                }
            }
            findoccurance(str, idx+1, element);

        }


            
    
        public static void main(String[] args) {
            
            String str = "abaacdaefaaha";
            findoccurance(str, 0, 'a');
            

            

            }



        }



// strictily incresing sorting

import java.util.Scanner;


    public class recursion {
        public static boolean isSorted(int arr[], int idx){
            if(idx == arr.length-1){
                return true;
            }
            if(arr[idx]>= arr[idx+1]){
                return false;

            }

            return isSorted(arr, idx+1);

        }
    

        
        public static void main(String[] args) {
            int arr[] ={1,2,2,3};
            System.out.println(isSorted(arr, 0));
           

            

            }



    }



import java.util.Scanner;


    public class recursion {
        public static void moveAllx(String str , int idx , int count , String newString){
            if(idx == str.length()){
                for(int i=0 ; i<count ;i++ ){
                    newString += 'x';
                }
                System.out.println(newString);
                return;
            }
            
            char currChar = str.charAt(idx);
            if(currChar == 'x'){
                count++;
                moveAllx(str, idx+1, count, newString);

            } else {
                newString += currChar ;
                moveAllx(str, idx+1, count, newString);
            }
        }
            
    
        public static void main(String[] args) {
            String str = "abxcxdxx";
            moveAllx(str, 0, 0, "");

           

            

            }



        }



import java.util.Scanner;


    public class recursion {
        public static boolean[] map = new boolean[26];

        public static void removeDuplicacy(String str ,int idx,String newString) {
            if(idx == str.length()){
                System.out.println(newString);
                return;
            }
            char currChar =str.charAt(idx);
            if(map[currChar -'a']){
                removeDuplicacy(str, idx+1 , newString);

            }else{
                newString  += currChar;
                map[currChar-'a'] =true;
                removeDuplicacy(str, idx+1, newString);
            }
           
    

        }    
        public static void main(String[] args) {
            String str = "abbccad";
            removeDuplicacy(str, 0, "");
           
            

            



    }
}

*/


