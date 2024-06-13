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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0|| head==null|| head.next==null)
        return head;
        ListNode t=head;
        int len=1;
        while(t.next!=null){
            t=t.next;
            len++;
        }
      t.next=head;
      int r=k%len;
      ListNode nlast=head;
      for(int i=0;i<len-r-1;i++)
      {
        nlast=nlast.next;
      }
      head=nlast.next;
      nlast.next=null;

     return head;
    }
}