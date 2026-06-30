/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode dumy = new ListNode(-1);
        ListNode curr = dumy;
        int sum =0 ; int carry =0 ;
        while(temp1!=null || temp2!=null){
            sum = carry;
            if(temp1!=null){
                sum+= temp1.val;
                 temp1 = temp1.next;
            }
            if(temp2!= null){
                sum+= temp2.val;
                 temp2 = temp2.next;

            }
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            carry = sum/10;
         
               
             
        
            


        }
        if(carry ==1){
            curr.next = new ListNode(1);
        }
 return dumy.next;

    }
}