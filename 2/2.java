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
        return re_node(l1, l2, 0);
    }
    
    public ListNode re_node(ListNode r1, ListNode r2, int carry)
    {
        ListNode final_r = new ListNode();
        int head_combine = r1.val + r2.val + carry;
        final_r.val = head_combine % 10;
        carry = head_combine / 10;
     
        if(r1.next == null && r2.next == null)
        {
            if(carry > 0)
            {
                final_r.next = new ListNode(1);
                carry = 0;
            }
            return final_r;
        }
        else
        {
            if(r1.next == null && r2.next != null)
        {
            r1.next = new ListNode(0);
            final_r.next = re_node(r1.next, r2.next , carry);
        } else
        
        if(r2.next == null && r1.next != null)
        {
            r2.next = new ListNode(0);
            final_r.next = re_node(r1.next, r2.next , carry);
        }
            else {
                final_r.next = re_node(r1.next, r2.next , carry);
            }
            
        }
        
       
        return final_r;
       
    }
    
}
