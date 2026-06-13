/*Input: head -> 1 -> 2 -> 3 -> 4 -> 5, pos = 1
Output: true
Explanation: The tail of the linked list connects to the node at 1st index. */
import java.util.*;
class Node {
    int data;
    ListNode next;
    Node(int x){
        data = x;
        next = null;
    }
}
public class DetectLoop{
    public boolean detect(ListNode head){
        ListNode temp = head;
        HashMap<ListNode, Integer> nodeMap = new HashMap<>();
        while(temp != null){
            if(nodeMap.containsKey(temp)){
                return true;
            }
            nodeMap.put(temp, 1);
            temp = temp.next;
        }
        return false;

    }
    public static void main(String args[]){
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third; // loop created

        DetectLoop dl = new DetectLoop();
        if(dl.detect(head)){
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }
    }
}