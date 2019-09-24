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
class Solution2{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int  carry=0;
        ListNode head1=l1;
        ListNode head2=l2;
        while(l1.next!=null&&l2.next!=null){
            if(l1.val+l2.val+carry<10){
                l1.val=l1.val+l2.val+carry;
                carry=0;
            }
            else{
                l1.val=(l1.val+l2.val+carry)%10;
                carry=1;
            }
            l1=l1.next;
            l2=l2.next;
        }
        if(l1.next==null&&l2.next==null)
        {
            if(l1.val+l2.val+carry<10){
                l1.val=l1.val+l2.val+carry;
            }
            else{
                l1.val=(l1.val+l2.val+carry)%10;
                ListNode temp=new ListNode(1);
                l1.next=temp;
            }
            return head1;
        }
        //l1或者l2的next为空
        if(l1.next==null||l2.next==null){
            if(l1.next==null)
                l1.next=l2.next;
            if(l1.val+l2.val+carry<10){
                l1.val=l1.val+l2.val+carry;
                carry=0;
            }
            else{
                l1.val=(l1.val+l2.val+carry)%10;
                carry=1;
            }
            l1=l1.next;
            while(carry==1){
                if(l1.val+carry<10){
                    l1.val++;
                    return head1;
                }
                else{
                    l1.val=0;
                    if(l1.next==null)
                    {
                        ListNode temp=new ListNode(1);
                        l1.next=temp;
                        return head1;
                    }
                    l1=l1.next;
                }
            } 
        }
        return head1;  
    }
}

public class P2 {
    public static void main(String[] args){
        Solution2 solution=new Solution2();
        ListNode first=new ListNode(8);
        ListNode second=new ListNode(2);
        first.addNode(9);
        first.addNode(9);
        //second.addNode(6);
       // second.addNode(9);
        //second.addNode(9);
        first.PrintList();
        second.PrintList();
        solution.addTwoNumbers(first, second);
        first.PrintList();
    }  
}
