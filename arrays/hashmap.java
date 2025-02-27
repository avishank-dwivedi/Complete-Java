package arrays;
import java.util.*;
public class hashmap {
    public static void main(String args[]){
        //creating
        HashMap<String , Integer> map = new HashMap<>();
        
        // inserting elements
        map.put("india", 120);
        map.put("china", 150);
        map.put("us", 30);
        map.put("china", 155);// list.add() will add the element to the list
        // set.add() will add the element to the set}


        //size 
        System.out.println("Size of the map is " + map.size());

        //print all elements
        System.out.println("Elements of the map are " + map);
        //searching -contains

        if(map.containsKey("india"))
            System.out.println("Element  found india");
        else
            System.out.println("Element not found");



        // System.out.println("Value of india is " + map.get("india"));
        // System.out.println("Value of china is " + map.get("indonesia"));
        
        int arr[] = {12 , 15 , 18};
        for(int i=0 ; i<3 ; i++){
            System.out.println(arr[i]+ "");
        }
        System.out.println();

        for(int val : arr){
            System.out.println(val + "");
        }
        System.out.println();
        //delete 
        // map.remove(china);
        // if(!map.containsKey("china")){
        //     System.out.println("we deleted china");
        // } 
        // Time Complexity: O(1) for insertion, deletion and searching

        //iterating over the map

        // Iterator it = map.entrySet().iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }        

        for(Map.Entry<String , Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    
}
