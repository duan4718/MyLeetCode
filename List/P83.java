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

class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return head;
        ListNode L=head;
        while(L.next!=null){
            if(L.val==L.next.val)              
                L.next=L.next.next;
            else
                L=L.next;
        }
        return head;
    }
}

public class P83 {
    public static void main(String[] args){
        Solution83 solution=new Solution83();
        ListNode first=new ListNode(1);
        first.addNode(1);
        first.addNode(2);
        first.addNode(3);
        first.addNode(3);
        first.PrintList();
        solution.deleteDuplicates(first).PrintList();   
    }
    
}
