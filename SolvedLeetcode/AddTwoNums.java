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
class AddTwoNums {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode la = l1;
        ListNode lb = l2;
        ListNode res = new ListNode(0);
        ListNode resfirst = res;
        int carry = 0;

        while (la != null || lb != null || carry != 0) {
            int sum = carry;

            if(la != null) {
                sum += la.val;
                la = la.next;
            }

            if(lb != null) {
                sum += lb.val;
                lb = lb.next;
            }

            carry = sum / 10;
            res.next = new ListNode(sum % 10);
            res = res.next;

        }
        return resfirst.next;
    }
}