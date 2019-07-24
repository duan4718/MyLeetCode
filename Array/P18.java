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

class Solution18{
    public List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> res = new LinkedList<>();
    Arrays.sort(nums);
    for(int i=0;i<nums.length-3;i++){
        if(i>0&&nums[i]==nums[i-1])    //if语句，不是while语句
            continue;                 //跳过重复的元素
        for(int j=i+1;j<nums.length-2;j++){
            if(j>i+1&&nums[j]==nums[j-1])
                continue;
            int k=j+1,l=nums.length-1;
            int goal=target-nums[i]-nums[j];
            while(k<l)
            {
                if(nums[k]+nums[l]==goal)
                {
                    res.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                    k++;
                    l--;
                    while(k<l&&nums[k]==nums[k-1]) k++;
                    while(k<l&&nums[l]==nums[l+1]) l--;
                }
                else if(nums[k]+nums[l]>goal)
                    l--;
                else
                    k++;
            }
        }     
    } 
    Iterator<List<Integer>> listIt = res.iterator();
    while(listIt.hasNext())
        System.out.println(listIt.next());
    return res;    
    }
}



public class P18 {
     public static void main(String[] args){
     Solution18 solution=new Solution18();
     int[] data = {-7,-5,0,7,1,1,-10,-2,7,7,-2,-6,0,-10,-5,7,-8,5};
     int target = 28;
     solution.fourSum(data,target);
    }  
}
