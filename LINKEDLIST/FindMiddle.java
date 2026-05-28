class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class FindMiddle {
    public static Node find(Node head){
        if(head == null || head.next == null) return null;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
            System.out.println();
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        Node head = new Node(arr[0]);
        Node temp = head;

        for(int i = 1; i < arr.length; i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        print(head);

            Node middle = find(head);
            
                System.out.println("Middle element: " + middle.data);
        


    }
}
