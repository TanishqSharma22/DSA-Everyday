/*Input: head = [1, 2, 3, 4]
Output:         [1, 4, 2, 3] */
class ListNode{
    int data;
    ListNode next;
    ListNode(int x){
        data = x;
        next = null;
    }
}
public class ReorderList {
    public void listreorder(ListNode head){
        if(head == null || head.next == null){
            return;
        }

        // find middle
        ListNode slow = head; // 1 
        ListNode fast = head; // 1
        while(fast != null && fast.next != null){
            slow = slow.next; // 2 3   middle slow = 3
            fast = fast.next.next;// 3 5
         } 
        // reverse second half
        ListNode second = slow.next; // 4
        slow.next = null; // 1 2 3 null
        ListNode prev = null; // 

        while(second != null){
            ListNode next = second.next; // 5
            second.next = prev; // null
            prev = second; //4
            second = next; // 5
        }
        //merge two halves
        ListNode first = head; //1
        second = prev;         //5
        while(second != null){
            ListNode tmp1 = first.next; // 2 3
            ListNode tmp2 = second.next; // 4 null
            first.next = second; //5 4
            second.next = tmp1; // 2 3
            first = tmp1; //2 3
            second = tmp2; //4 null
        } 

        
    }
    
        public static void main(String args[]){
                ListNode head = new ListNode(1);
                head.next = new ListNode(2);
                head.next.next = new ListNode(3);
                head.next.next.next = new ListNode(4);
                head.next.next.next.next = new ListNode(5);
                ReorderList rl = new ReorderList();
                rl.listreorder(head);
                while(head != null){
                    System.out.print(head.data + " ");
                    head = head.next;
                }
        }
    }
    

