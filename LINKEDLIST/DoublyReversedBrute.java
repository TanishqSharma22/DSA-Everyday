import java.util.Stack;
import java.util.*;

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
 public class DoublyReversedBrute {
    public static Node buildDll(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            temp.prev = prev;
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    public static void printDll(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node Reverse(Node head){
        if(head == null || head.next == null) return head;

        Stack<Integer> stack = new Stack<>();
        Node temp = head;
        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            temp.data = stack.pop();
            temp = temp.next; 

        }
        return head;


    }
    public static void main(String args[]){
        int[] arr = {12, 5, 8, 7, 4};
        Node head = buildDll(arr);
        System.out.print("Original: ");
        printDll(head);
        head = Reverse(head);
       System.out.print("Reversed: ");
       printDll(head);


    }
    
}
