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
        ListNode prev=null;
        ListNode curr=head;
        int length=0;
        while(curr!=null){
            length=length+1;
            curr=curr.next;
        }
        if(length==1) return null;
        int pos=length-n+1;
        curr=head;
        //remove from head 
        if(pos==1){
            curr=curr.next;
            head.next=null;
            head=curr;
            return head;
        }
        //remove from end
        if(pos==length){
            ListNode prevcurr=null;
            while(curr.next!=null){
                prev=curr;
                curr=curr.next; 
            }
            prev.next=null;
            return head;
        }
        curr=head;
        //remove from between
        int countpos=1;
        while(countpos!=pos){
            prev=curr;
            curr=curr.next;
            countpos+=1;

        }
        prev.next=curr.next;
        curr.next=null;
        return head;
    }
}