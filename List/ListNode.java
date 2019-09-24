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
public class ListNode {
    int val;
    ListNode next;
    ListNode head=this;
    ListNode(int x) { val = x; }
    public void addNode(int data){
        ListNode newNode = new ListNode(data);
        while(head.next!=null)
             head=head.next;
        head.next=newNode;
    }
    public void PrintList( ){
            for(ListNode x=this;x!=null;x=x.next)
                System.out.print(x.val+" ");
            System.out.println();
    }
}
