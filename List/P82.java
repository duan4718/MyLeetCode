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
class Solution82 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return head;
        ListNode L=new ListNode(-1);
        L.next=head;
        ListNode pre=L;
        while(head.next!=null){
            if(head.val!=head.next.val){
                pre=head;
                head=head.next;
            }
            else
            {
                head=head.next;
                while(head.next!=null&&head.val==head.next.val){
                    head=head.next;
                }
                if(head.next==null){
                    pre.next=null;
                    return L.next;
                }
                pre.next=head.next;
                head=pre.next;
            }
        }
        return L.next;
    }
}
public class P82 {
    public static void main(String[] args){
        Solution82 solution=new Solution82();
        ListNode first=new ListNode(1);
        first.addNode(1);
        first.addNode(2);
        first.addNode(3);
        first.addNode(3);
        first.addNode(5);
        first.PrintList();
        solution.deleteDuplicates(first).PrintList();
    }
    
}
