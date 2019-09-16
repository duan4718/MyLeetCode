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
class Solution48{
    public void rotate(int[][] matrix) {
        int length=matrix.length;
        for(int i=1;i<length;i++)
            for(int j=0;j<i;j++)
            {
             int temp=matrix[i][j];
             matrix[i][j]=matrix[j][i];
             matrix[j][i]=temp;
            }
        for(int i=0;i<length/2;i++)
            for(int j=0;j<length;j++)
            {
                int temp=matrix[j][i];
                matrix[j][i]=matrix[j][length-i-1];
                matrix[j][length-i-1]=temp;
                
            }
    }
}


public class P48 {
    public static void main(String[] args){
    Solution48 solution=new Solution48();
    int[][] data = {{1,2,3},{4,5,6},{7,8,9}};
    solution.rotate(data);
    for(int i=0;i<3;i++)
        for(int j=0;j<3;j++)
            System.out.println(data[i][j]);
    }
}
