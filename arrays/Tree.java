package arrays;
import java.util.*;

// public class Tree {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;   
//             this.right = null;  
//         }
//     }

//     static class BinaryTree{
//         static int idx = -1;
//         public static Node buildTree(int nodes[]) {
//             idx++;  
//             if (nodes[idx] == -1) {
//                 return null;
                
//             }
//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);

//             return newNode;
//         }
//     }

//     public static void preorder(Node root){
//         if(root == null){
//             return;
//         }
//         System.out.print(root.data + " ");
//         preorder(root.left);
//         preorder(root.right);
//     }


//     public static void main(String[] args) {
//         int nodes[] = {1 , 2 , 4 , -1 , -1 ,5 ,-1 , -1, 3 ,-1 , 6 , -1 , -1};
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(nodes);
//         //System.out.println(root.data);
//         preorder(root);
//     }
// }


//inorder traversal and postorder traversal ,level order traversal

// public class Tree {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;   
//             this.right = null;  
//         }
//     }

//     static class BinaryTree{
//         static int idx = -1;
//         public static Node buildTree(int nodes[]) {
//             idx++;  
//             if (nodes[idx] == -1) {
//                 return null;
                
//             }
//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);

//             return newNode;
//         }
//     }

//     public static void preorder(Node root){
//         if(root == null){
//             return;
//         }
//         System.out.print(root.data + " ");
//         preorder(root.left);
//         preorder(root.right);
//     }

//     public static void inorder(Node root){
//         if(root == null){
//             return;
//         }
//         inorder(root.left);
//         System.out.print(root.data + " ");
//         inorder(root.right);
//     }

//     public static void postorder(Node root){
//         if(root == null){
//             return;
//         }
//         postorder(root.left);
//         postorder(root.right);
//         System.out.print(root.data + " ");
//     }

//     public static void levelOrder(Node root){
//         if(root == null){
//             return;
//         }
//         Queue<Node> q = new LinkedList<>();
//         q.add(root);
//         q.add(null);

//         while(!q.isEmpty()){
//             Node currNode = q.remove();

//             if( currNode == null){
//                 System.out.println();
//                 if (q.isEmpty()) {
//                     break;
//                 }else{
//                     q.add(null);                           
//                 }                
//             }else{
//                 System.out.print(currNode.data + " ");
//                 if (currNode.left != null) {
//                     q.add(currNode.left);
                    
//                 }
            

//             if(currNode.right != null){
//                 q.add(currNode.right);
//             }
//         }
//     }
// }
//     public static void main(String[] args) {
//         int nodes[] = {1 , 2 , 4 , -1 , -1 ,5 ,-1 , -1, 3 ,-1 , 6 , -1 , -1};
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(nodes);
//         //System.out.println(root.data);
//         inorder(root);
//         System.out.println(); 
//         postorder(root);
//         System.out.println();
//         levelOrder(root);

//     }
// }






// // count nodes in a tree and sum of nodes in a tree
// // hight of tree and diameter of tree

// public class Tree {
//         static class Node {
//             int data;
//             Node left;
//             Node right;
    
//             Node(int data) {
//                 this.data = data;
//                 this.left = null;   
//                 this.right = null;  
//             }
//         }
    
//         static class BinaryTree{
//             static int idx = -1;
//             public static Node buildTree(int nodes[]) {
//                 idx++;  
//                 if (nodes[idx] == -1) {
//                     return null;
                    
//                 }
//                 Node newNode = new Node(nodes[idx]);
//                 newNode.left = buildTree(nodes);
//                 newNode.right = buildTree(nodes);
    
//                 return newNode;
//             }
//         }

//         // //count nodes
//         // public static int countofnodes(Node root){
//         //     if(root == null){
//         //         return 0;
//         //     }
//         //     int left = countofnodes(root.left);
//         //     int right = countofnodes(root.right);
//         //     return left + right + 1;
//         // }
//         // // sum of nodes

//         // public static int sumofnodes(Node root){
//         //     if(root == null){
//         //         return 0;
//         //     }
//         //     int left = sumofnodes(root.left);
//         //     int right = sumofnodes(root.right);
//         //     return left + right + root.data;
//         // }

//         //height of tree
//         public static int height(Node root){
//             if(root == null){
//                 return 0;
//             }
//             int left = height(root.left);
//             int right = height(root.right);
//             return Math.max(left, right) + 1;
//         }

//         // //diameter of tree
//          public static int diameter(Node root){
//             if (root == null) {
//                 return 0;
                
//             }
//             int diam1 = diameter(root.left);
//             int diam2 = diameter(root.right);
//             int diam3 = height(root.left) + height(root.right) + 1;

//             return Math.max(diam1, Math.max(diam2, diam3));
//         }

    
//         public static void main(String[] args) {
//                     int nodes[] = {1 , 2 , 4 , -1 , -1 ,5 ,-1 , -1, 3 ,-1 , 6 , -1 , -1};
//                     BinaryTree tree = new BinaryTree();
//                     Node root = tree.buildTree(nodes);

//                     // System.out.println(countofnodes(root));
//                     // System.out.println(sumofnodes(root));
//                     // System.out.println(height(root));
//                     System.out.println(diameter(root));

                    
//                 }
//             }





//subtree has another tree
public class Tree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isIdentical(TreeNode root , TreeNode subRoot){
        if(root == null && subRoot == null){
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }
        if(root.val != subRoot.val){
            return false;
        }
        return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
    }
    public boolean issubtree(TreeNode root , TreeNode subRoot){
        if(subRoot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(root.val == subRoot.val){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }
        return issubtree(root.left, subRoot) || issubtree(root.right, subRoot);
    }
    
}

