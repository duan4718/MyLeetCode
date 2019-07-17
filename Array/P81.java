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
如果长度大于1，且收尾元素相同则删除末尾元素
*/
/*class Solution81{
    public boolean search(int[] nums, int target) {
       if(nums.length == 1)
        {
           return target == nums[0];
        }
        int low = 0;
        int high = nums.length-1;
        //进行预处理
        while(high-low>=1 && nums[low]==nums[high])
                high--;
        int mid = (low+high)/2;    
        while(low <=  high)
        {
            if(target == nums[mid])
                return true;
            //判断是否有序
            if(nums[low] <= nums[high] && nums[mid] >= nums[low] && nums[mid]<=nums[high])
            {
                if(target < nums[low] || target > nums[high])
                    return false;
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
                return false;
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
                return false;
            }
            return false;
        } 
    return false;
    }
}*/
class Solution81{
    public boolean search(int[] nums, int target) {
       if(nums.length == 1)
        {
           return target == nums[0];
        }
        int low = 0;
        int high = nums.length-1;
        //进行预处理,当尾元素与首元素相同时，去除尾元素
        while(high-low>=1 && nums[low]==nums[high])
                high--;
        int mid;    
        while(low <=  high)
        {
            mid = (low+high)/2;
            if(target == nums[mid])
                return true;
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
    return false;
    }
}

public class P81 {
    public static void main(String[] args) {
     Solution81 solution=new Solution81();
     int[] data = {1,3,1,1,1,1};
     int target= 3;
     System.out.println(solution.search(data,target));
     }
    
}
