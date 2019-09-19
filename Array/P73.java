/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author DUAN
 */
/*
//时间复杂度O(n^2),空间复杂度O（m+n)
class Solution73{
    public void setZeroes(int[][] matrix) {
        int[] row=new int[matrix.length];
        int[] col=new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                    row[i]=col[j]=1;
                
            }
        for(int i=0;i<row.length;i++)  //适用于0少的情况，如果0比较多，可以从头到尾遍历，matrix[i][j],如果row[i]col[j]任意一个为零就把当前元素置为0
        {
            if(row[i]==1){
                for(int j=0;j<col.length;j++)
                    matrix[i][j]=0;
            }
        }
        for(int i=0;i<col.length;i++)
        {
            if(col[i]==1){
                for(int j=0;j<row.length;j++)
                    matrix[j][i]=0;
            }
        }  
    }
}
*/
//想个空间复杂度O(1)的算法
class Solution73{
    public void setZeroes(int[][] matrix){
        boolean isZeroCol=false;
        boolean isZeroRow=false;
        for(int i=0;i<matrix.length;i++) //check the first column
            if(matrix[i][0]==0){
                isZeroCol=true;
                break;
            }
        for(int i=0;i<matrix[0].length;i++)//check the first row
            if(matrix[0][i]==0){
                isZeroRow=true;
                break;
        }
        for(int i=1;i<matrix.length;i++){//process except the first row and column
            for(int j=1;j<matrix[0].length;j++)
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
        }
        for (int i = 1; i < matrix.length; i++) { //process except the first row and column
           for (int j = 1; j < matrix[0].length; j++) 
               if (matrix[i][0] == 0 || matrix[0][j] == 0)
                   matrix[i][j] = 0;
        }
        if (isZeroCol) { //handle the first column
            for (int i = 0; i < matrix.length; i++) 
                matrix[i][0] = 0;
        }
        if (isZeroRow) { //handle the first row
            for (int i = 0; i < matrix[0].length; i++) 
                matrix[0][i] = 0;
        }
    }
}

public class P73 {
    public static void main(String[] args){
        Solution73 solution=new Solution73();
        int[][] data = {{1,2,3},{4,0,6},{7,8,9}};
        solution.setZeroes(data);
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++){
                System.out.print(data[i][j]+" ");
                if(j==2)
                    System.out.println();
            }
        System.out.println("row: "+data.length);
        System.out.println("col: "+data[0].length);   
    }
}
