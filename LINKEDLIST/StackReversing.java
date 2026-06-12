import java.util.*;
class ListNode {
    int data;
    ListNode next;
    ListNode (int x){
        data = x;
        next = null;
    }
}

public class StackReversing {
    public ListNode reverse(ListNode head){
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            temp.data = stack.pop();
            temp = temp.next;
        }
        return head;
    }
    public static void main(String args[]){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        StackReversing sol = new StackReversing();
        head = sol.reverse(head);
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

    }
}
