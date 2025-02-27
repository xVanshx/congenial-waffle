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
// M1
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode newHead , n;
        if(l1.val <= l2.val) {
            newHead = l1;
            l1 = l1.next;
        }
        else {
            newHead = l2;
            l2 = l2.next;
        }
        n = newHead;
        while(l1 != null && l2!=null) {
            if(l1.val <= l2.val) {
                n.next = l1;
                l1 = l1.next;
            }
            else {
                n.next = l2;
                l2 = l2.next;
            }
            n = n.next;
        }
        if(l1 != null) {
            n.next = l1;
        }
        if(l2 != null) {
            n.next = l2;
        }
        return newHead;
    }
}

// M2 - Using Dummy Node

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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode dummy = new ListNode();
        ListNode tmp = dummy;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                tmp.next = l1;
                l1 = l1.next;
            }
            else {
                tmp.next = l2;
                l2 = l2.next;
            }
            tmp = tmp.next;
        }
        if(l1 != null) {
            tmp.next = l1;
        }
        if(l2 != null) {
            tmp.next = l2;
        }
        return dummy.next;
    }
}