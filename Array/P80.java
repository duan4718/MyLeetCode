/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Given nums = [1,1,1,2,2,3],
Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
 */
package Array;

/**
 *
 * @author DUAN
 */
class Solution80{
    public int removeDuplicates(int[] nums) {
        if(nums.length <=  1)
            return nums.length;
        int n = 1;
        int index = 0;
        for(int i = 1;i < nums.length;i++){
             if(nums[i] != nums[index])
             {
                 nums[++index] = nums[i];
                 n = 1;
             }
             else if(nums[i] == nums[index] && n == 1){
                 nums[++index] = nums[i];
                 n = 2;
             }

        }
           for(int element: nums)
        {
            System.out.println(element);
        }
    return index+1;
    }
}


public class P80 {
     public static void main(String[] args) {
     Solution80 solution=new Solution80();
     int[] data = {1,1,1,2,2,3,3,3,4};
     solution.removeDuplicates(data);
     }
}
