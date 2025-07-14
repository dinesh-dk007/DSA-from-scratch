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
    public int getDecimalValue(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while(temp.next != null){
            count++;
            temp=temp.next;
        }
        temp = head;
        int ans = 0;
        while(temp != null){
            if(temp.val == 1){
                ans += (1 << count);
            }
            temp = temp.next;
            count--;
        }
        return ans;
    }
}