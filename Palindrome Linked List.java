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
        ListNode current = head;
        List<Integer> list = new ArrayList<>();
        while(current != null){
            list.add(current.val);
            current = current.next;         
        }
        int flag = 0;

        for (int i = 0; i <= list.size() / 2 && list.size() != 0; i++) {
 
            // Check if first and last element are different
            // Then set flag to 1.
            if (list.get(i) != list.get(list.size() - i - 1)) {
                flag = 1;
                break;
            }
        }
        if(flag == 0) return true;
        return false;
    }
}
