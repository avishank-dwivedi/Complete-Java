package arrays;
// print the elements of the binary search tree in the given range
// the elements should be in the sorted order
public class print_in_range {
   


    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;   
            this.right = null;  
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data >val){
            root.left = insert(root.left, val);
        }else
            root.right = insert(root.right, val);
        return root;
    } 
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
        
    }

    public static void printinrange(Node root , int X , int Y){
        if (root == null){
            return;   
        }
        if(root.data >= X && root.data <= Y){
            printinrange(root.left, X, Y);
            System.out.print(root.data + " ");
            printinrange(root.right, X, Y);
        }
        else if(root.data >= Y){
            printinrange(root.left, X, Y);
        }
        else{
            printinrange(root.right, X, Y);
        }
    }
    public static void main(String args[]){
        int values[] ={5 , 1, 3 , 4 , 2 , 7};
        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        

        }
        inorder(root);
        System.out.println();
        printinrange(root, 3, 6);

    }
}


