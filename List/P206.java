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
/*
//迭代
class Solution206 {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode L1=head.next;
        head.next=null;
        while(L1.next!=null){
            ListNode L2=L1.next;
            L1.next=head;
            head=L1;
            L1=L2;
        }
        L1.next=head;
        return L1;
    }
}
*/
//递归
class Solution206{
    public ListNode reverseList(ListNode head){
        if (head==null||head.next==null)
            return head;
        ListNode L=head.next;
        ListNode newL=reverseList(L);
        L.next=head;
        head.next=null;
        return newL;
    }
}

public class P206 {
    public static void main(String[] args){
        Solution206 solution=new Solution206();
        ListNode first=new ListNode(8);
        first.addNode(9);
        first.addNode(9);
        first.PrintList();
        solution.reverseList(first).PrintList();
        
        
    }
}