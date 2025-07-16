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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode temp1 = head;
        while(temp != null){
            while(temp1 != null && temp1.val == temp.val){
                temp1 = temp1.next;
            }
            temp.next = temp1;
            temp = temp1;
        }
        return head;
    }
}