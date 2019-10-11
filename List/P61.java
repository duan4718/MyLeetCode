/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

/**
 *
 * @author DUAN
 */
class Solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0)
            return head;
        ListNode L=head;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        int count=1;
        while(count<k&&L.next!=null){
            L=L.next;
            count++;
        }
        if(L.next==null)
            return rotateRight(head,k%count);
        else{
            ListNode pre=dummy;
            while(L.next!=null)
            {
                pre=pre.next;
                L=L.next;
            }
            dummy.next=pre.next;
            L.next=head;
            pre.next=null;
        }
        return dummy.next;
    }
}

public class P61 {
    public static void main(String[] args){
        Solution61 solution=new Solution61();
        ListNode first=new ListNode(1);
        first.addNode(2);
        first.addNode(3);
        first.addNode(4);
        first.addNode(5);
        first.addNode(6);
        first.PrintList();
        solution.rotateRight(first,7).PrintList();
    }
}
