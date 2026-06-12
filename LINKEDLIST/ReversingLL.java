
class ListNode {
    int data;
    ListNode next;
    ListNode (int x){
        data = x;
        next = null;
    }
}

public class ReversingLL {
    public ListNode reverse(ListNode head){
       ListNode prev = null;
       ListNode temp = head;
       while(temp != null){
        ListNode front = temp.next;
        temp.next = prev;
        prev = temp;
        temp = front;
       }
       return prev;
    }
    public static void main(String args[]){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ReversingLL sol = new ReversingLL();
        head = sol.reverse(head);
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

    }
}
