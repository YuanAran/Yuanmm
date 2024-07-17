public class LeedCode2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        int carry = 0;
        int val1;
        int val2;
        ListNode headNode = new ListNode(0);
        ListNode ptrNode = headNode;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                val1 = 0;
            } else {
                val1 = l1.val;
                l1 = l1.next;
            }
            if (l2 == null) {
                val2 = 0;
            } else {
                val2 = l2.val;
                l2 = l2.next;
            }
            sum = val1 + val2 + carry;
            carry = sum / 10;
            ptrNode.next = new ListNode(sum % 10);
            ptrNode = ptrNode.next;
        }
        if (carry > 0) {
            ptrNode.next = new ListNode(carry);
            ptrNode = ptrNode.next;
        }
        return headNode.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode k = addTwoNumbers(l1, l2);
        while (k != null) {
            System.out.println(k.val);
            k = k.next;
        }
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
