
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class DoublyResversedOptimal {
    static Node build(int[] arr){
        Node head = new Node(arr[0]);
        Node current = head;

        for(int i = 1; i < arr.length; i++){
            Node newNode = new Node(arr[i]);
            newNode.prev = current;
            current.next = newNode; 
            current = newNode;
        }
        return head;

    }
    static Node reverse(Node head){
        Node current = head;
        Node newHead = null;
        while(current != null){
            Node nextNode = current.next;
            current.next = current.prev;
            current.prev = nextNode;
            newHead = current;
            current = nextNode;
        }
        return newHead;
    }
    static void print(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
    }
    System.out.println();

    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        Node head = build(arr);
        System.out.print("Original : ");
        print(head);
        Node reversed = reverse(head);
        System.out.print("Reversed : ");
        print(reversed);
       }

    
}
