/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode hA, ListNode hB) {
        ListNode s=hA;
        ListNode f=hB;
        while(s!=f){
            if(s!=null){
                s=s.next;
            }
            else{
                s=hB;
            }
            if(f!=null){
                f=f.next;
            }
            else{
                f=hA;
            }
        }
        return s;
    }
}