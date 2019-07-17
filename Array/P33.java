/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.

Your algorithm's runtime complexity must be in the order of O(log n).

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
 */
package Array;

/**
 *
 * @author DUAN
 */

/*
class Solution{
    public int search(int[] nums, int target) {
        if(nums.length == 1)
        {
            if(target == nums[0])
                return 0;
            else
                return -1;
        }
        int low = 0;
        int high = nums.length-1;
        int mid = (low+high)/2;    
        while(low <=  high)
        {
            if(target == nums[mid])
                return mid;
            //判断是否有序
            if(nums[low]<nums[high])
            {
                if(target < nums[mid])
                {
                    high = mid-1;
                    mid = (high+low)/2;
                }
                else
                {
                    low = mid+1;
                    mid = (high+low)/2;
                }
                if(target < nums[low] || target > nums[high])
                    return -1;
                continue;
            }
            //判断mid元素是在第一队列，还是在第二队列
            if(nums[mid] >= nums[low])
            {
                if(target < nums[mid] && target < nums[low] || target > nums[mid] )
                {
                    low = mid+1;
                    mid = (high+low)/2;
                    continue;
                }
                else if(target < nums[mid] &&target >= nums[low])
                {
                    high = mid-1;
                    mid = (high+low)/2;
                    continue;
                }
            }
            if(nums[mid] < nums[low])
            {
                if(target < nums[mid] || target > nums [mid] && target > nums[high] )
                {
                    high = mid-1;
                    mid = (high+low)/2;
                    continue;
                }
                else if(target > nums[mid] && target <= nums[high] )
                {
                    low = mid+1;
                    mid = (high+low)/2;
                    continue;
                }
            }
            return -1;
        } 
    return -1;
    }
}
*/

class Solution33{
    public int search(int[] nums, int target) {
       /* if(nums.length == 1)
        {
            if(target == nums[0])
                return 0;
            else
                return -1;
        }*/
        int low = 0;
        int high = nums.length-1;
        int mid ;    
        while(low <=  high)
        {
            mid = (low+high)/2;
            if(target == nums[mid])
                return mid;
            //判断是否有序
           /* if(nums[low]<nums[high])
            {
                if(target < nums[low] || target > nums[high])
                    return -1;
                if(target < nums[mid])
                    high = mid-1;
                else
                    low = mid+1;
                continue;
            }*/
            //判断mid元素是在第一队列，还是在第二队列
            if(nums[mid] >= nums[low])
            {
                if(target < nums[mid] &&target >= nums[low])
                
                    high = mid-1;
                else
                    low =  mid+1;       
            }
            else
            {
                if(target > nums[mid] && target <= nums[high] )
                    low = mid+1;
                else
                    high = mid-1;
            }
        } 
    return -1;
    }
}
        

public class P33 {
    public static void main(String[] args) {
     Solution33 solution=new Solution33();
     int[] data = {3,4,5,0,1};
     int target= 1;
     System.out.println(solution.search(data,target));
     }
}
