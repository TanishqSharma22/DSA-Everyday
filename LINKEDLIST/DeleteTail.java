class Node{
    int data;
    Node next;
    Node(int val){
        data = val;
        next = null;
    }
}

public class DeleteTail {
    // func to delete tail node
    public Node deleteTailNode(Node head){
        // if list is empty
        if(head == null || head.next == null){
            return null;
        }
        // Traverse to the second last node
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        // Delete the tail node
        current.next = null;
        return head;
    }
    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        DeleteTail obj = new DeleteTail();
        head = obj.deleteTailNode(head);
        // print 
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }

        
    }
    
}
