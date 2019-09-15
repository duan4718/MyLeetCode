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
class Solution42{
    public int trap(int[] height) {
       if(height.length<=2)
           return 0;
       int area=0;
       int low,high;
       low=searchLow(height);
       if(low==-1)
           return 0;
       else
           high=searchHigh(low+1,height);
       while(low<high){
           while(height[low+1]>height[high])
               low++;
           int sum=0;
           for(int i=low+1;i<high;i++)
               sum+=height[i];
           area=area+(high-low-1)*Integer.min(height[low], height[high])-sum;
           low=high;
           high=searchHigh(low+1,height);
       }
       return area;
    }
    int searchLow(int[] data){
        for(int i=0;i<data.length-1;i++){
            if(data[i]>data[i+1])
                return i;
        }
        return -1;
    }
    
    int searchHigh(int n,int[] data){
        int flag=0;
        if(data.length-1<n)
            return -1;
        for(int i=n+1;i<data.length-1;i++)
        {
            if(data[i]>data[i-1]) 
            {
                 flag=1;
            }
            if(flag==1&&data[i]>data[i+1])
                return i;            
        }
        if(data[data.length-1]>data[data.length-2])
            return data.length-1;
        return -1;
    }
}
*/

//当前节点的最大水容积，取决于左边最大和右边最大

class Solution42{
    public int trap(int[] height) {
        int length=height.length;
        int area=0;
        if(length<=2)
            return 0;
        int[] L_max=new int[length];
        int[] R_max=new int[length];
        
        L_max[0]=0;
        for(int i=1;i<length-1;i++)
            L_max[i]=(height[i-1]>L_max[i-1])?height[i-1]:L_max[i-1];
        
        R_max[length-1]=0;
        for(int i=length-2;i>0;i--)
            R_max[i]=(height[i+1]>R_max[i+1])?height[i+1]:R_max[i+1];
        
        for(int i=1;i<length-1;i++)
        {
            if(height[i]>=L_max[i]||height[i]>=R_max[i]) {
            } else
                area+=(L_max[i]>R_max[i])?R_max[i]-height[i]:L_max[i]-height[i];
            
        }
        return area;
    }
}

public class P42 {
    public static void main(String[] args){
        Solution42 solution=new Solution42();
        int[] data = {5,2,1,2,1,5};
        System.out.println(solution.trap(data));
    }
    
}
