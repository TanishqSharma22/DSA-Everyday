/*Input: linkedList = [1, 2, 3], X = 7
Output: [7, 1, 2, 3]
Explanation:
7 was added as the 1st node. */


class ListNode{
    public int data;
    public ListNode next;

    ListNode(){
        data = 0;
        next = null;
    }
    ListNode(int x){
        data = x;
        next = null;
    }
    ListNode(int x, ListNode next){
        data = x;
        this.next = next;
    }
}
public class InsertHeadNode {
    // Function to insert a new node at the head of the linked list
    public ListNode insertAtHead(ListNode head, int X) {
        ListNode newNode = new ListNode(X, head);
        return newNode;
    }
    //Function to print the linked list
    public void printList(ListNode head) {
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        InsertHeadNode obj = new InsertHeadNode();
        // linkedlist >> 1 > 2 > 3
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        System.out.print("Original Linked List:");
        obj.printList(head);
        // insert at head
        head = obj.insertAtHead(head, 7);
        System.out.println("Linked List after insertion at head:");
        obj.printList(head);
    }       
}
