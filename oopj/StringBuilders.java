package oopj;

public class StringBuilders{
    
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);

        //charact at index 0

        System.out.println(sb.charAt(0));

        //set char at index 0

        sb.setCharAt(0,'p');
        System.out.println(sb);

        sb.insert(2 , 'n');
        System.out.println(sb);


        sb.delete(2,4);
        System.out.println(sb);

        sb.append("s");
        sb.append("t");
        sb.append("a");
        sb.append("r");
        sb.append("k");
        System.out.println(sb);
        
    }
}



// import java.io.*;

// class A {
//     public static void main(String args[])
//     {
//         StringBuffer sb = new StringBuffer("Hello ");
//         sb.append("Java"); // now original string is changed
//         System.out.println(sb.length());
//     }
// }