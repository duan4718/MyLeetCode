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
 * res.add(Arrays.asList(num[i], num[lo], num[hi]));
 */
/*
超时，而且hashmap会把重复的key值覆盖
class Solution15{
    public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> res = new LinkedList<>();    
    Map<Integer,Integer> map = new HashMap<>();
    for(int i = 0;i < nums.length;i++)
        map.put(nums[i], i);
    System.out.println(map);
    for(int i=0; i < nums.length-1;i++)
        for(int j = i+1; j < nums.length;j++ )
        {
            int complement=-(nums[i]+nums[j]);
            if(map.containsKey(complement)&& map.get(complement)>j)
            {
                int v1=nums[i],v2=nums[j],v3=complement;
               if(v1>v2)
               {
                   int temp=v1;
                   v1=v2;
                   v2=temp;
               }
               if(v1>v3)
               {
                   int temp=v1;
                   v1=v3;
                   v3=temp;
               }
               if(v2>v3)
               {
                   int temp=v2;
                   v2=v3;
                   v3=temp;
               }
               if(!res.contains(Arrays.asList(v1,v2,v3)))
                   res.add(Arrays.asList(v1,v2,v3));
            }
        }

    return res;
    }
}
*/
class Solution15{
    public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> res = new LinkedList<>();
    Arrays.sort(nums);
    for(int i = 0;i<nums.length-2;i++){
        if(i>0&&nums[i]==nums[i-1])    //跳过相同的结果
            continue;
        int j=i+1,k=nums.length-1;
        int target=-nums[i];
        while(j<k){
            if(nums[j]+nums[k]==target){
                res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                j++;
                k--;
               while(j<k&&nums[j]==nums[j-1]) j++;
               while(j<k&&nums[k]==nums[k+1]) k--;
            }
            else if(nums[j]+nums[k]<target)
                j++;
            else
                k--;
        }
    }
    Iterator<List<Integer>> listIt = res.iterator();
    while(listIt.hasNext())
        System.out.println(listIt.next());
    return res;
  }
}




public class P15 {
  public static void main(String[] args){
     Solution15 solution=new Solution15();
     int[] data = {-1, 0, 1, 2, -1, -4};
     solution.threeSum(data);
    }  
}
