/*Given the head of a doubly linked list and an integer X, insert a node with value X before the head of the linked list and return the head of the modified list.

Example 1
Input: head = [1, 2, 3], X = 3
Output: head = [3, 1, 2, 3]
Explanation: 3 was added before the 1st node. Note that the head's value is changed.*/

class Node{
    int data;
    Node next;
    Node back;

    public Node(int data1, Node next1, Node back1){
        data = data1;
        next = next1;
        back = back1;
    }
    public Node(int data1){
        data = data1;
        next = null;
        back = null;
    }
}

public class DoublyInsert {
    public static Node insertBeforeHead(Node head, int x){
        Node newNode = new Node(x, head, null);
        if(head != null){
            head.back = newNode;
        }
        return newNode;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.back = head.next;

        int x = 3;
        head = insertBeforeHead(head, x);
        
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
        
    
}
