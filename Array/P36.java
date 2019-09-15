/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;
import java.util.*;

/**
 *
 * @author DUAN
 */

class Solution36{
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            HashSet<Character> rows=new HashSet<>();
            HashSet<Character> colums=new HashSet<>();
            HashSet<Character> cube=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'&&!rows.add(board[i][j]))
                    return false;
                if(board[j][i]!='.'&&!colums.add(board[j][i]))
                    return false;
                int RowIndex = 3*(i/3);
                int ColIndex = 3*(i%3);
                if(board[RowIndex + j/3][ColIndex + j%3]!='.' && !cube.add(board[RowIndex + j/3][ColIndex + j%3]))
                return false;
            }
            
        }
        return true;
    }
}



public class P36 {
     public static void main(String[] args){
        Solution36 solution=new Solution36();
             
    }
}
