package Advnce;
/* 
public class backTracking {
    public static void printPermutation(String str ,String perm , int idx){
        if(str.length() == 0){
            System.out.println(perm);
            return;

        }
        for(int i=0 ; i<str.length();i++){
            char currchar = str.charAt(i);
            String newStr = str.substring(0, i)+ str.substring(i+1);
            printPermutation(newStr, perm+currchar, idx+1);

        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        printPermutation(str, "", 0);

    }
    
}


// n queen

import java.util.*;

public class backTracking{
    public boolean isSafe(int row,int col , char[][] board){
        //horizontal
        for(int j=0;j<board.length;j++){
            if(board[row][col]=='Q'){
                return false;
            }

        }
        //vertical
        for(int i=0;i<board[0].length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //upper left
        int r=row;
        for(int c=col ; c>=0 && r>=0;c--,r--){
            if(board[r][c] =='Q'){
            return false;
            }       
        }
        // upper right
         r = row;
         for(int c =col ; col<board.length && r>=0; r-- , c++){
            if(board[r][c] =='Q'){
                return false;
            }
         }
        //lower left
        r=row;
        for(int c=col;c>=0&& r<board.length ;r++,c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        //lower right
        r=row;
        for(int c=col ;c<board.length && r<board.length; r++,c--){
            if(board[r][c]=='Q'){
                return false;
            }

        }
        return true;

    }
    public void saveBoard(char[][] board ,List<List<String>> allBoards){
        String row = "";
        List<String>newboard = new ArrayList<>();

        for(int i =0 ; i< board.length ; i++){
            row = "";
        
            for(int j=0; j<board[0].length ;j++){
                if (board[i][j]== 'Q')
                   row +='Q';
                else
                   row += '.';    
        }
        newboard.add(row);
    }
    allBoards.add(newboard);

    }

    public void helper(char[][] board,List<List<String>>allBoards , int col){
        if(col == board.length){
            saveBoard(board,allBoards);
            return;
        }
        for(int row = 0; row<board.length; row++){
            if(isSafe(row,col,board)){
                board[row][col] = 'Q';
                helper(board, allBoards, col-1);
                board[row][col]='.';
            }
        }

    }
    public List<List<String>> SolveQueens(int n){
        List<List<String>>allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board, null, 0);
        return allBoards;
    }       





}
*/
// Merge Short
//nlogn
/* 
public class backTracking {
    public static void conquer(int arr[] ,int si ,int mid ,int ei){
        int merged[] = new int[ei-si+1];

        int idx1 =si;
        int idx2 = mid+1;
        int x = 0;

        while (idx1<= mid &&idx2 <=ei) {
            if(arr[idx1]<=arr[idx2]){
                merged[x++]= arr[idx1++];
               

            }else{
                merged[x++] = arr[idx2++];
            }
            
        }
        while (idx1 <=mid) {
            merged[x++]=arr[idx1++];
            
        }
        while (idx2 <=ei) {
            merged[x++]=arr[idx2++];
        }
        for(int  i = 0 , j=si; i<merged.length; i++, j++){
            arr[j]=merged[i];
        }


    }
    public static void divide(int arr[], int si,int ei){
        if(si >= ei){
            return;
        }
        int mid = si+(ei-si)/2;
        divide(arr ,si ,mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);

    }


    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;

        divide(arr, 0, n-1);
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+ " ");

        }
        System.out.println();
    }
 }

 */

 // quick short

 public class backTracking{
    public static int partition(int arr[], int low , int high){
        int pidx = arr[high];
        int i=low-1;

        for(int j=low; j<high ; j++){
            if(arr[j] < pidx){
                i++;
                //swap
                int temp =arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp =arr[i];
        arr[i] = pidx;
        arr[high] = temp;
        return i;

    }
    public static void quickshort(int arr[] , int  low ,int high){
        if(low<high){
            int pidx = partition(arr ,low ,high);

            quickshort(arr, low, high-1);
            quickshort(arr, low+1, high);
        }
    }

    
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        int n = arr.length;

        quickshort(arr , 0 , n-1);

        for(int i=0 ;i<n; i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
        

    }
}
