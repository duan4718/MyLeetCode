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

class Solution134{
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;
        int j=0;
        for(int i=0,sum=0;i<gas.length;i++){
            sum+=gas[i]-cost[i];
            total+=gas[i]-cost[i];
            if(sum<0){
                j=i+1;
                sum=0;
            }
        }
        return total>=0?j:-1;
    }
}
public class P134 {
    public static void main(String[] args){
        Solution134 solution=new Solution134();
        int[] gas={3,1,1};
        int[] cost={1,2,2};
        System.out.println(solution.canCompleteCircuit(gas,cost));
    }
    
}
