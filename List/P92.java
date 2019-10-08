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


class Solution92{
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null) return null;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode cur=dummy;
        ListNode pre=dummy;
        for(int i=0;i<m;i++)
        {
            pre=cur;
            cur=cur.next;
        }
        ListNode start=cur;
        ListNode next=cur.next;
        for(int i=m;i<n;i++)
        {
            pre.next=next;
            ListNode temp=next.next;
            next.next=cur;
            cur=next;
            next=temp;
        }
        start.next=next;
        return dummy.next;
    }
}

public class P92 {
     public static void main(String[] args){
        Solution92 solution=new Solution92();
        ListNode first=new ListNode(2);
        first.addNode(0);
        first.addNode(1);
        first.addNode(9);
        first.PrintList();
        solution.reverseBetween(first,3,4).PrintList();   
    }
}
