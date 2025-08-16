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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int mid = (int)count/2;
        int i = 0;
        temp = head;
        while(i < mid){
            temp = temp.next;
            i++;
        }
        return temp;
    }
}