public class LeedCode6 {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode ptr = head;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                ptr.next = list1;
                list1 = list1.next;
            } else {
                ptr.next = list2;
                list2 = list2.next;
            }
            ptr = ptr.next;
        }
        if(list1==null){
            ptr.next=list2;
        }else{
            ptr.next=list1;
        }

        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
       ListNode listNode= mergeTwoLists(l1,l2);
       while(listNode!=null){
           System.out.println(listNode.val);
           listNode=listNode.next;
       }
    }
}
