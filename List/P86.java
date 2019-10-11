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

/*难理解
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode L1=new ListNode(-1);
        ListNode L2=new ListNode(-1);
        L1.next=head;
        ListNode cur=head;
        ListNode L=L1;
        ListNode tail=L2;
        while(L1.next!=null){
            if(cur.val<x){
                L1=cur;
                cur=cur.next;
            }
            else
            {
                tail.next=cur;
                tail=cur;
                L1.next=cur.next;
                cur=L1.next;
            }
        }
        tail.next=null;
        L1.next=L2.next;
        return L.next;
    }
}
*/
class Solution86 {
    public ListNode partition(ListNode head, int x) {
        ListNode L1=new ListNode(-1), L2=new ListNode(-1);
        ListNode cur1=L1,cur2=L2;
        while(head!=null){
            if(head.val<x){
                cur1.next=head;
                cur1=head;
            }
            else
            {
                cur2.next=head;
                cur2=head;
            }
            head=head.next;
        }
        cur2.next=null;  //很重要
        cur1.next=L2.next;
        return L1.next;
    }
}
public class P86 {
    public static void main(String[] args){
    Solution86 solution=new Solution86();
    ListNode first=new ListNode(1);
    first.addNode(4);
    first.addNode(3);
    first.addNode(2);
    first.addNode(5);
    first.addNode(2);
    first.PrintList();
    solution.partition(first,3).PrintList();
    }
}
