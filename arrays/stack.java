package arrays;

// using linked list
/* 
public class stack {
    static class Node{
        int data;
        Node next ;
        public Node(int data){
            this.data = data;
            next = null;

        }
    
    }    
    static class Stack {
        public static Node head;
        public static boolean isEmpty(){
            return head == null ;
        }
        public static void push (int data){
            Node newnode = new Node(data); 
                if(isEmpty()){
                    head = newnode;
                    return;

                }
                newnode.next = head;
                head = newnode;

                }

                public static int pop() {
                   if( isEmpty()){
                        return -1;
                    }
                    int top = head.data;
                    head = head.next;
                    return top;


                }

                public static int peek(){
                    if(isEmpty()){
                        return -1;
                    }
                    return head.data;
                }
            }
            public static void main(String[] args) {
                Stack s = new Stack();
                s.push(1);
                s.push(2);
                s.push(3);
                s.push(4);

                while (!s.isEmpty()) {
                    System.out.println(s.peek());
                    s.pop();
                    
                }

                
            }
                
            
        
            
        }
    



// using array list
import java.util.*;
public class stack {
    static class newstack{
         static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() ==0;
        }

        // push
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top; 
        }

        //peek 
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }

    }
            public static void main(String[] args) {
                newstack s = new newstack();
                s.push(1);
                s.push(2);
                s.push(3);
                s.push(4);

                while (!s.isEmpty()) {
                    System.out.println(s.peek());
                    s.pop();
                    
                }

                
            }
                
            
        
            
        }
        */
    
    //using java collection frame work



import java.util.*;
public class stack {
    
            public static void main(String[] args) {
               Stack<Integer> s = new Stack<>();
                s.push(1);
                s.push(2);
                s.push(3);
                s.push(4);

                while (!s.isEmpty()) {
                    System.out.println(s.peek());
                    s.pop();
                    
                }

                
            }
                
            
    }
            
        