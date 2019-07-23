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

class Solution1{
    public int[] twoSum(int[] nums, int target) {
    Map<Integer,Integer> map = new HashMap<>();
 /*   for(int i = 0;i<nums.length;i++)
        map.put(nums[i], i);
    for(int i = 0;i < nums.length;i++)
    {
        int complement = target-nums[i];
        if(map.containsKey(complement)&&map.get(complement)!=i)
        {
            return new int[] {i , map.get(complement)};
        }
    }*/
    for(int i = 0;i < nums.length;i++)
    {
        int complement = target-nums[i];
        if(map.containsKey(complement))
            return new int[]{map.get(complement),i};
        else
            map.put(nums[i], i);
    }
    return new int [] {0,0};
    
    }
}
public class P1 {
    public static void main(String[] args){
     Solution1 solution=new Solution1();
     int[] data = {1,5,7};
     int m = 6;
     System.out.println(Arrays.toString(solution.twoSum(data,m)));
    }
}
