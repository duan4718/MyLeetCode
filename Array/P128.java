/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.*;


/**
 *
 * @author DUAN
 */
/*
class Solution128{
    public int longestConsecutive(int[] nums) {
    int max = 1; 
    int count = 1;
    Arrays.sort(nums);
    for(int i=1;i<nums.length;i++)
    {
        if(nums[i]==nums[i-1]+1)
            count++;
        else if(nums[i]!=nums[i-1])//需要考虑数组中存在重复的数（0,1，1,1,2）
        {
            count=1;
        }
        max=Math.max(max, count);
        
    }
    return max;
    }
}
*/
/*
class Solution128{
    public int longestConsecutive(int[] nums) {
    Set<Integer> hashSet = new HashSet<Integer>();  //使用HashSet进行存储，不存在重复的元素,直接遍历时为有序队列，存储复杂度O（n），时间复杂度O(n)
    for(int num : nums)
         hashSet.add(num);
    System.out.println(hashSet);
    int max = 1 ;
    int count = 1;
    for(int num:hashSet)     //hashSet并不是有序遍历，而是负数和正数分别有序，{9,1,-3,2,4,8,3,-1,6,-2,-4,7}->[-1, 1, -2, -3, 2, 3, -4, 4, 6, 7, 8, 9]
      {
          if(hashSet.contains(num+1))
              count++;
          else
              count=1;
          max=Math.max(max, count); 
      }
    return max;
    }
}
*/

class Solution128{
    public int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }

        int longestStreak = 0;

        for (int num : num_set) {
            if (!num_set.contains(num-1)) {  //每次都是找队头元素，-4，-3，-2，-1,1,2,3,4,7,8,9只会进循环3次，-4，1,和7才会进入循环
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(currentNum+1)) {
                    currentNum += 1;
                    currentStreak += 1;  //找到底
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
public class P128 {
    public static void main(String[] args){
     Solution128 solution=new Solution128();
     int[] data = {9,1,-3,2,4,8,3,-1,6,-2,-4,7};
     System.out.println(solution.longestConsecutive(data));
    }
}
