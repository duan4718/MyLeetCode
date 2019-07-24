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

class Solution31{
    public void nextPermutation(int[] nums) {
        int flag=0;
        for(int i=nums.length-1;i>0;i--)
        {
            if(nums[i]>nums[i-1])
            {
                for(int j=nums.length-1;j>i-1;j--)  //应该从后向前找一个大于nums[i-1]的数
                    {
                        if(nums[j]>nums[i-1])
                        {
                            int temp=nums[i-1];
                            nums[i-1]=nums[j];
                            nums[j]=temp;
                            reverse(nums,i,nums.length-1);
                            flag=1;
                            break;   
                        }
                    }             
                break;
            }
          }
        if(flag==0){   //如果是降序则把数组reverse
           reverse(nums,0,nums.length-1);
        }
        for(int num:nums)
            System.out.print(num);
    }
    public void reverse(int[] nums,int low,int high)
    {
        for(int i=low,j=high;i<j;i++,j--)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
         }
        
    }
}

public class P31 {
    public static void main(String[] args){
        Solution31 solution=new Solution31();
        int[] data = {9,4,6,5,3,2};
        solution.nextPermutation(data);    
    }
}
