package arrays;
import java.util.*;
public class Hashing {
    public static void main(String args[]){
       //creating
        HashSet<Integer> set = new HashSet<>();
        
        // inserting elements
            set.add(1);
            set.add(2);
            set.add(3);
            set.add(1);// list.add() will add the element to the list
            // set.add() will add the element to the set}


        //size 
        System.out.println("Size of the set is " + set.size());

        //print all elements
        System.out.println("Elements of the set are " + set);
        //searching -contains

        if(!set.contains(1))
            System.out.println("Element not found 1");
        else
            System.out.println("Element found");
        //delete 
        // set.remove(1);
        // if(!set.contains(1)){
        //     System.out.println("we deleted 1");
        // } 
        // Time Complexity: O(1) for insertion, deletion and searching

        //iterating over the set

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}