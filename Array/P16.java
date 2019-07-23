/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Given array nums = [-1, 2, 1, -4], and target = 1.
The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
package Array;

import java.util.Arrays;

/**
 *
 * @author DUAN
 */
//与P15题类似
class Solution16{
    public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int min=Integer.MAX_VALUE;
    int closest=0;
    for(int i=0;i<nums.length-2;i++){
        if(i>0&&nums[i]==nums[i-1])
            continue;
        int j=i+1,k=nums.length-1; //使用i，k两个游标，进行左右夹逼
        while(j<k)
        {
            int currentSum=nums[i]+nums[j]+nums[k]; //更新j，k值后需要重新计算currentSum的值
            if(currentSum==target)
                return target;
            else if(currentSum<target)
            {
                if(Math.abs(currentSum-target)<min){   
                    closest=currentSum;
                    min = Math.abs(closest-target);
                }
                j++;
                while(j<k&&nums[j]==nums[j-1]) j++; //跳过重复的值
            }
            else
            {
                if(Math.abs(currentSum-target)<min){   
                    closest=currentSum;
                    min = Math.abs(closest-target);
                }
                k--;
                while(j<k&&nums[k]==nums[k+1]) k--; //跳过重复的值
            }
        }
        
    }
    return closest;
    }
}
public class P16 {
     public static void main(String[] args){
     Solution16 solution=new Solution16();
     int[] data = {-1,2, 1,  -4};
     int m = 1;
     System.out.println(solution.threeSumClosest(data,m));
    }
}
