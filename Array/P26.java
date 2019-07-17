/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

 */
package Array;

/**
 *
 * @author DUAN
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        int n = 0;
        for(int element:nums){
             if(element != nums[n])
             {
                 nums[++n] = element;
             }   
        }
        for(int element: nums)
        {
            System.out.println(element);
        }
        return n+1;
    }
}

public class P26 {
     public static void main(String[] args) {
     Solution solution=new Solution();
     int[] data = {1,1,2,2,3,4,4,};
     solution.removeDuplicates(data);
     }
}
