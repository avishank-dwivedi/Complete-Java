package arrays;
/*
public class queus {

    static class queuss {
        static int arr[];
        static int size ;
        static int rear = -1;


        queuss(int n){
            arr = new int[n];
            this.size = n;

        }
        public static boolean isEmpty(){
            return rear == -1 ;

        }
        // add

        public static void add(int data){
            if(rear == size-1){
                System.out.println("fulll queue");
            
            return;
            }
        
        rear++;
        arr[rear] = data;
        
        }
        
        // dequeue 
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front = arr[0];
            for(int i=0 ; i<rear ; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        queuss q = new queuss(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
            
        }

    }
}
 

public class queus {

    static class queuss {
        static int arr[];
        static int size ;
        static int rear = -1;
        static int front = -1;


        queuss(int n){
            arr = new int[n];
            this.size = n;

        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1 ;

        }

        public static boolean isfull(){
            return (rear+1) % size == front;
             
        }

        // enqueus

        public static void add(int data){
            if(isfull()){
                System.out.println("fulll queue");
            
                 return;
            }

            // first elemnet add
            if(front == -1){
                front = 0;

            }

        
            rear = (rear + 1) % size;
            arr[rear] = data;
        
        }
        
        // dequeue 
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int reault = arr[front];

            if (rear == front){
                rear = -1;
                front = -1;
            }
            else{
                front = (front + 1)% size;
            }
        
            return reault;
        }


        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        queuss q = new queuss(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
            
        }

    }
}
 */
