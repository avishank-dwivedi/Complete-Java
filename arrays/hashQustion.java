package arrays;
// //majority element
// import java.util.HashMap;

// public class hashQustion {
//     public static void majorityElement(int num[]){
//         HashMap<Integer, Integer> map = new HashMap<>();
//         int n = num.length;
//         for(int i=0; i<n; i++){
//             if(map.containsKey(num[i])){
//                 map.put(num[i], map.get(num[i])+1);
//             }else{
//                 map.put(num[i], 1);
//             }
//         }
//         for(int key : map.keySet()){
//             if(map.get(key) > n/3){
//                 System.out.println("Majority element is " + key);
                
//             }

//         }
//     }
//     public static void main(String args[]){
//         int num[] = {1 , 2};
//         majorityElement(num);
//     }
// }


// //unition of 2 array

// import java.util.*;
// public class hashQustion {
//     public static int union(int arr1[] , int arr2[]){//0(n)
//         HashSet<Integer> set = new HashSet<>();
        
//         for(int i=0 ; i<arr1.length ; i++){
//             set.add(arr1[i]);
//         }
//         for(int j=0 ; j<arr2.length ; j++){
//             set.add(arr2[j]);
//         }
//         return set.size();

//     }
//     public static void main(String args[]){
//         int arr1[] = {1, 2, 3, 4, 5};
//         int arr2[] = {1, 2, 3};
//         System.out.println(union(arr1, arr2));
//     }

// }


// //intersection of 2 array
// import java.util.*;

// public class hashQustion{
//     public static int intersation(int arr1[] , int arr2[]){
//         HashSet<Integer> set = new HashSet<>();
//         for(int i=0 ; i<arr1.length ; i++){
//             set.add(arr1[i]);
//         }
//         int count = 0;
//         for(int j=0 ; j<arr2.length ; j++){
//             if(set.contains(arr2[j])){
//                 count++;
//                 set.remove(arr2[j]);
//             }
//         }
        
        
//         return count;//O(n)


        
//     }
//     public static void main(String args[]){
//         int arr1[] = {1, 2, 3, 4, 5};
//         int arr2[] = {1, 2, 3};
//         System.out.println(intersation(arr1, arr2));//3
//     }
// }


// // //find ltinerary from tickets
// import java.util.*;
// public class hashQustion {
//     public static String getStart(HashMap<String ,String> tick){
//         HashMap<String , String> revMap = new HashMap<>();


//         for(String Key :tick.keySet()){
//             revMap.put(tick.get(Key), Key);
//         }
//         for(String Key :tick.keySet()){
//             if(!revMap.containsKey(Key)){
//                 return Key;
                
//             }
//         }
//         return null;

          
//     } 

// public static void main(String args[]){
//     HashMap<String , String> map = new HashMap<>();
//     map.put("Chennai", "Banglore");
//     map.put("Bombay", "Delhi");
//     map.put("Goa", "Chennai");
//     map.put("Delhi", "Goa");

//     String start = getStart(map);

//     while(map.containsKey(start)) {
//         System.out.print(start+ "->");
//         start = map.get(start);
        
//     }
//     System.out.println(start);

// }
// }

// subarray sum equal to k


import java.util.*;
public class hashQustion {
public static void main(String args[]){
    HashMap<Integer, Integer> map = new HashMap<>();
    int arr[] = {10 , 2 , -2 , -20 , 10};
    int k = -10;
    map.put(0, 1);
    int ans = 0 ;
    int sum = 0;
     for(int j=0 ; j<arr.length ; j++){
        sum += arr[j];
        if(map.containsKey(sum - k)){
            ans += map.get(sum - k);
        }
        if(
            map.containsKey(sum)){
            map.put(sum, map.get(sum)+1);
        }else{
            map.put(sum,  1);
        }
    }
    
    System.out.println(ans);
}
}