package Leetcode.hard;

public class leet_23 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // Merge K Lists
    public static ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0)
            return null;

        ListNode result = null;

        for (int i = 0; i < lists.length; i++) {
            result = mergeTwoLists(result, lists[i]);
        }

        return result;
    }

    // Merge Two Sorted Lists
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {

            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }

            current = current.next;
        }
        if (l1 != null)
            current.next = l1;
        else
            current.next = l2;

        return dummy.next;
    }

    public static void main(String[] args) {

        int[][] listsArray = { { 1, 4, 5 }, { 1, 3, 4 }, { 2, 6 } };

        ListNode[] lists = new ListNode[listsArray.length];

        for (int i = 0; i < listsArray.length; i++) {
            ListNode dummy = new ListNode(0);
            ListNode curr = dummy;

            for (int val : listsArray[i]) {
                curr.next = new ListNode(val);
                curr = curr.next;
            }

            lists[i] = dummy.next;
        }

        ListNode result = mergeKLists(lists);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}