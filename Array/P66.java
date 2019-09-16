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

class Solution66{
    public int[] plusOne(int[] digits) {
         int n = digits.length;
    for(int i=n-1; i>=0; i--) {
        if(digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        
        digits[i] = 0;
    }
    
    int[] newNumber = new int[n+1];
    newNumber[0] = 1;
    
    return newNumber;
    }
}


public class P66 {
    public static void main(String[] args){
        Solution66 solution=new Solution66();
        int[] data={9,9,9,9};
        solution.plusOne(data);  
    }
}
