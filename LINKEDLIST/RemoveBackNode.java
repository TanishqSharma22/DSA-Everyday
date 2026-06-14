import java.util.*;
class ListNode {
    int data;
    ListNode next;

    ListNode(int data1, ListNode next1) {
        this.data = data1;
        this.next = next1;
    }

    ListNode(int data1) {
        this.data = data1;
        this.next = null;
    }
}


public class RemoveBackNode {
    public ListNode deleteNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode slow = dummy;
        ListNode fast = dummy;

        for(int i = 0; i < n; i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void main(String args[]){
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        int n = 3;

        ListNode head = new ListNode(arr.get(0));
        head.next = new ListNode(arr.get(1));
        head.next.next = new ListNode(arr.get(2));
        head.next.next.next = new ListNode(arr.get(3));
        head.next.next.next.next = new ListNode(arr.get(4));

        RemoveBackNode obj = new RemoveBackNode();
        ListNode result = obj.deleteNthFromEnd(head, n);
        while(result != null){
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}
    

