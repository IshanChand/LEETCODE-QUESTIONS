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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        int c=0;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        temp=head;
        int A[]=new int[c];
        for(int i=c-1;i>=0;i--)
        {
            A[i]=temp.val;
            temp=temp.next;
        }
        int k=0;
        while(k!=c)
        {
            if(head.val!=A[k])
            return false;
            head=head.next;
            k++;
        }
        return true;
    }
}