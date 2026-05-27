/*Delete head of Doubly Linked List
Given the head of a doubly linked list, remove the node at the head of the linked list and return the head of the modified list.
The head is the first node of the linked list.

Example 1
Input: doublyLinkedList = [1, 2, 3]
Output: [2, 3]*/


class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data1){
        data = data1;
        next = null;
        prev = null;
    }
}
    class DoublyDeletehead {
        public static Node delete(Node head){
            if(head == null || head.next == null) return null;
            head = head.next;
            head.prev = null;
            return head;
        }
        public static void printList(Node head){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public static void main(String args[]){
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.prev = head;
            head.next.next = new Node(3);
            head.next.next.prev = head.next;
            head = delete(head);
            printList(head);


        }

    }
