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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n<0)return head;
        ListNode t=head;
        int c=0;
        while(t!=null)
        {
            c++;
            t=t.next;
        }
        if(c==n)
        return head.next;
        int i=1;
        ListNode oh=head;
        while(c-n!=i)
        {
            head=head.next;
            i++;
        }
        head.next=head.next.next;
        return oh;
    }
}