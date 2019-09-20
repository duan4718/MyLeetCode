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

class Solution135{
    public int candy(int[] ratings) {
        int[] data=new int[ratings.length];
        int sum=0;
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1])
                data[i]=data[i-1]+1;
        }
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1])
                data[i]=Integer.max(data[i],data[i+1]+1);
        }
        for(int num:data)
            sum+=num;
        return sum+ratings.length;
    }
}
public class P135 {
    public static void main(String[] args){
        Solution135 solution=new Solution135();
        int[] data={1,2,2};
        System.out.println(solution.candy(data));
    }
}
    
    

