package framework;

public class revLL {
    
    Node head;
    private int size;

    revLL(){
        this.size = 0;
    }



    class Node {
        int data;
        Node next;

        Node(int  data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } 
            newNode.next = head;
            head = newNode;
        
    }

    // Add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
    }

    // Print list
    public void printList() {
        Node currNode = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            
            currNode = currNode.next;
        }
        System.out.println("NULL"); // To end the line after printing the list
    }



   // delete first
    public void deleteFirst(){
       if(head == null){
        System.out.println("this list is empty");
        return;

       }
       size--;
       head = head.next;
   }

   // delete last

    public void deleteLast(){
        if(head == null){
            System.out.println("this list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node seconfLast = head;
        Node lastNode = head.next; // head.next = null ->lastNode = null
        while (lastNode.next != null) {  // null.next
            lastNode = lastNode.next;
            seconfLast = seconfLast.next;
            
        }

        seconfLast.next = null;
   }

   public int getsize(){
    return size;

   }

   public void reverseItrate(){
     if(head == null || head.next == null){
        return;
     }

     Node prevNode = head;
     Node currNode = head.next;
     while (currNode !=  null) {
        Node nextNode = currNode.next;
        currNode.next = prevNode;

        // update 
        prevNode = currNode;
        currNode = nextNode;
        
     }
     head.next = null;
     head = prevNode;

   }

   public Node reverseRecursive(Node head){
    if(head == null || head.next == null){
        return head;
    }
    Node newHead  = reverseRecursive(head.next);
    head.next.next = head;
    head.next = null;

    return newHead;

   } 


    public static void main(String[] args) {
        revLL list = new revLL();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();

        //list.reverseItrate();

        list.head = list.reverseRecursive(list.head);

        list.printList();

        
    }
}


