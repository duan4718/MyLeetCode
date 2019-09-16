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

class Solution70{
    public int climbStairs(int n) {
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                break;
        }
        int res=2;
        int pre=1;
        int temp=0;
        for(int i=3;i<=n;i++){
            temp=res;
            res=pre+res;
            pre=temp;
        }
        
        
        return res;
    }
}

public class P70 {
    public static void main(String[] args){
        Solution70 solution=new Solution70();
        System.out.println(solution.climbStairs(5)); 
    }
}
