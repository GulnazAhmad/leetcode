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
    public void reorderList(ListNode head) {
        ListNode curr=head;
        ListNode trial=head;
        ArrayList<Integer> list= new ArrayList<>();
        while(trial!=null){
            list.add(trial.val);
            trial=trial.next;
        }
        int p=0;
        int x=0;
        int y=list.size()-1;
        while(curr!=null){
            if(p%2==0){
                curr.val=list.get(x);
                x+=1;
                p+=1;
                curr=curr.next;
            }
            else{
                System.out.println(y);
                curr.val=list.get(y);
                y-=1;
                p+=1;
                curr=curr.next;
            }    
        }
    }
}