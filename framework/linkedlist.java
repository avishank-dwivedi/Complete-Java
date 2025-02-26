package framework;

public class linkedlist {
    Node head;
    private int size;

    linkedlist(){
        this.size = 0;
    }



    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } 
            newNode.next = head;
            head = newNode;
        
    }

    // Add last
    public void addLast(String i) {
        Node newNode = new Node(i);
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


    public static void main(String[] args) {
        linkedlist list = new linkedlist();

        list.addFirst("a");
        list.addFirst("is");
        list.addLast("test");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getsize());
    }
}
