class Node {
    int data;                              // Node class
    Node next;

Node(int data) {
    this.data = data;                     // constructor to initailize the data and next piointer
    this.next = null;
}
}

public class lengthLinkedlist {
    // Function to find the length
    public int lengthOfLinkedList(Node head) {
        // Initialize counter to 0
        int count = 0;
        // Initialize a temporary pointer to the head 
        Node temp = head;
        // Traverse the linked list until the end is reached
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        lengthLinkedlist list = new lengthLinkedlist();
        System.out.println("Length of the linked list: " + list.lengthOfLinkedList(head));
    }
    
}

