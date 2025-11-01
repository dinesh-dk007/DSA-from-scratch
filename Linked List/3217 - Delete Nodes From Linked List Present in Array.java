class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for(int x: nums)set.add(x);
        if(head == null) return null;
        while(head!=null && set.contains(head.val))
            head = head.next;
        if(head == null) return null;
        var current = head;
        while(current.next!=null){
            if(set.contains(current.next.val)){
               current.next = current.next.next; 
            }
            else{   
                current = current.next;
            }
        }
        return head;
    }
}