
public class IntersectionOfTwoLinkedList {
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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null || headB == null) {
            return null;
        }
        int a = 0;
        int b = 0;

        ListNode atemp = headA;
        ListNode btemp = headB;

        while(atemp != null || btemp != null) {
            if(atemp != null) {
                a++;
                atemp = atemp.next;
            }
            if(btemp != null) {
                b++;
                btemp = btemp.next;
            }
        }

        atemp = headA;
        btemp = headB;
        
        while (a != b) {
            if(a > b) {
                atemp = atemp.next;
                a--;
            } else {
                btemp = btemp.next;
                b--;
            }
        }

        while (atemp != null && btemp != null) {
            if (atemp == btemp) {
                return atemp;
            }
            atemp = atemp.next;
            btemp = btemp.next;
        }
        return null;        
    }
}
