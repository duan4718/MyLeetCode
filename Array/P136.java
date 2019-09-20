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
class Solution136 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i : nums) {
             result ^= i;
        }
         return result;   
    }
}

public class P136 {
    public static void main(String[] args){
        Solution136 solution=new Solution136();
        int[] data={3,3,1,8,1,2,2};
        System.out.println(solution.singleNumber(data));
    }
}
