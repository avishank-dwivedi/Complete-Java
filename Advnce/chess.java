package Advnce;

// n queen

import java.util.*;

public class chess{
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