package Advnce;
/* 
public class TOH {
    public static void towerOfHanoi(int n , String scr , String helper ,String dest){
        if(n==1){
            System.out.println(" transfer disk"+ n + "from"+scr+ "to " +dest);
            return;
        }
        towerOfHanoi(n-1, scr,  dest , helper);
        System.out.println(" transfer disk"+ n + "from"+scr+"to "+dest);
        towerOfHanoi(n-1, helper,scr, dest);
    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
        
    }

}

 
 
 public class TOH {
 
    public static void subsequence (String str , int idx ,String newstring){
        if(idx == str.length()){
            System.out.println(newstring);
            return;
        }
         char currChar =str.charAt(idx);
         //to be
         subsequence(str, idx+1, newstring+currChar);

         // or not to  be
         subsequence(str, idx+1, newstring);

    }
    public static void main(String[] args) {
        String str ="abc";
        subsequence(str, 0, ""); 
    }

        
}
 */

 public class TOH {
 
    public static String[] keypad = {".", "abc","def" ,"ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void princomb (String str ,int idx ,String combination ){
        if(idx == str.length()){
            System.out.println(combination);
            return ;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar-'0'];

        for(int i=0 ; i<mapping.length();i++){
            princomb(str, idx+1, combination+mapping.charAt(i));
        }


    }
    
       

    
    public static void main(String[] args) {
        String str ="23";
        princomb(str, 0, "");
        
    }

        
}