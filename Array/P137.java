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

/*位运算
public int singleNumber(int[] nums) {
    int res = 0;
    for(int i = 0; i < 32; i++){
        int sum = 0;
        for(int n: nums)
            sum+=((n>>i)&1);
        sum %= 3;
        if(sum==1)     
           res |= sum<<i;
    }
    return res;
}
*/



class Solution137 {
    public int singleNumber(int[] nums) {
        int a=0,b=0;
        for(int i=0;i<nums.length;i++)
        {
            b=(b^nums[i])&~a;
            a=(a^nums[i])&~b;
        }
        return b;
    }
}
public class P137 {
    public static void main(String[] args){
        Solution137 solution=new Solution137();
        int[] data={3,2,3,8,2,3,2};
        System.out.println(solution.singleNumber(data));
    }
    
}
