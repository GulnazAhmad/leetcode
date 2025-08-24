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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=null;
        
        if(list1==null && list2==null){
            return head;
        }
        else if(list1==null){
            return list2;
        }
        else if(list2==null){
            return list1;
        }
         if(list1.val<=list2.val){
                ListNode newnode=new ListNode(list1.val);
                head=newnode;
                newnode.next=null;
                list1=list1.next;
            }
        else{
            ListNode newnode=new ListNode(list2.val);
                head=newnode;
                newnode.next=null;
                list2=list2.next;

        }
        ListNode curr=head;
        while(list1!=null &&list2!=null){
            if(list1.val<=list2.val){
                ListNode newnode=new ListNode(list1.val);
                curr.next=newnode;
                newnode.next=null;
                list1=list1.next;
                curr=curr.next;
            }
            else{
                ListNode newnode=new ListNode(list2.val);
                curr.next=newnode;
                newnode.next=null;
                list2=list2.next;
                curr=curr.next;
            }
        }
        while(list1!=null){
            ListNode newnode=new ListNode(list1.val);
            curr.next=newnode;
            newnode.next=null;
            list1=list1.next;
            curr=curr.next;
        }
        while(list2!=null){
            ListNode newnode=new ListNode(list2.val);
            curr.next=newnode;
            newnode.next=null;
            list2=list2.next;
            curr=curr.next;
        }
        return head;
    }
}