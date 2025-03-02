package arrays;


public class TrieDS{// 0(l) - l is the length of the string
    static class Node{
        Node[] children;
        boolean eow;

        public Node(){
            children = new Node[26];// a - z
            for(int  i =0 ; i < 26 ; i++){
                children[i] = null;
            }
            eow = false;
        }
    }
    static Node root = new Node();
    public static void insert(String word){
        Node curr  = root;
        for(int i =0 ; i <word.length() ; i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            if (i == word.length() - 1){
                curr.children[idx].eow = true;
                
            }
            curr = curr.children[idx];
        }
    }
    public static boolean search(String key){
        Node curr = root;
        for(int i =0 ; i < key.length() ; i++){
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];
            if(node == null){
                return false;
            }
            if(i == key.length() - 1 && node.eow == false){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    public static boolean wordbreak(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i =1 ; i <= key.length() ; i++){
            String firstpart = key.substring(0 , i);
            String secondpart = key.substring(i);
            if(search(firstpart) && wordbreak(secondpart)){
                return true;
            }

        }
        return false;
    }
    public static void main(String args[]){
        String word[] = {"i", "like", "sam", "samsung", "mobile"};
        String key = "ilikesamsung";
        for(int i=0 ; i < word.length ; i++){
            insert(word[i]);
        }
        
        System.out.println(wordbreak(key));
       

    }
}
