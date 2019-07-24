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
class Solution27{
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
                nums[count++]=nums[i];
        }
         return count;
    }
}

public class P27 {
    public static void main(String[] args){
     Solution27 solution=new Solution27();
     int[] data = {3,2,2,3};
     int target = 3;
     System.out.print(solution.removeElement(data,target));    
    }
    
}
