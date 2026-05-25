/*You are given the head of a singly linked list and an integer key.
Return true if the key exists in the linked list, otherwise return false.

Example 1
Input: head = [1, 2, 3, 4], key = 3
Output: true
Explanation: The linked list is 1 → 2 → 3 → 4. The key 3 is present in the list.*/

class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data = data;
        this.next = null;
    }
}
public class SearchinLinkedList {
    public boolean searchKey(ListNode head, int key){
        ListNode current = head;
        while(current != null){
            if(current.data == key){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public static void main(String args[]){
        SearchinLinkedList obj = new SearchinLinkedList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        int key = 3;
        boolean result = obj.searchKey(head, key);
        System.out.println("Is the key " + key + " present in the linked list? " + result);
    }
    
}
