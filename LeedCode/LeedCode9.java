package leedcode;

import java.util.Stack;

public class LeedCode9 {
    public ListNode reverseList(ListNode head) {
    Stack<ListNode> stack=new Stack<>();
    while(head!=null){
        stack.push(head);
        head=head.next;
    }
    ListNode newHead=new ListNode();
    ListNode ptr=newHead;
    while(!stack.isEmpty()){
        ptr.next= new ListNode(stack.pop().val);
        ptr=ptr.next;
    }
    return newHead.next;
}
}
