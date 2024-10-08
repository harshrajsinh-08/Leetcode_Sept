import java.util.*;

class sept_06 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;}
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> s = new HashSet<>();
        for (int x : nums) {
            s.add(x);
        }
        ListNode temp = new ListNode(0, head);
        for (ListNode pre = temp; pre.next != null;) {
            if (s.contains(pre.next.val)) {
                pre.next = pre.next.next;
            }else {
                pre = pre.next;
            }
        }

        return temp.next;
    }
}