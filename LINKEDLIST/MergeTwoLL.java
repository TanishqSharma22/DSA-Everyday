/*Input: list1 = head -> 1 -> 3 -> 5, list2 = head -> 2 -> 4 -> 6
Output: head -> 1 -> 2 -> 3 -> 4 -> 5 -> 6
Explanation: head -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 , the underlined nodes come from list2, the others come from list1. */

import org.w3c.dom.Node;

class ListNode{
    int data;
    ListNode next;
    ListNode(int x){
        data = x;
        next = null;
    }
}
public class MergeTwoLL {
   public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // make sure list1 always starts with the smaller value
        if (list1.data > list2.data) {
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }

        ListNode res = list1;

        while (list1 != null && list2 != null) {
            ListNode temp = null;
            // advance list1 as long as its values are <= list2's current value
            while (list1 != null && list1.data <= list2.data) {
                temp = list1;
                list1 = list1.next;
            }
            // attach list2 at the right position
            temp.next = list2;

            // swap: now process list2 as if it were list1
            ListNode tmp = list1;
            list1 = list2;
            list2 = tmp;
        }
        return res;
    }
    public static void main(String args[]){
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        ListNode res = mergeTwoLists(list1, list2);
        while (res != null) {
            System.out.print(res.data + " ");
            res = res.next;
        }


    }
    
}
