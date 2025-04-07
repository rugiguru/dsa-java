package patterns.twoPointer.slowAndFast;


import java.util.HashSet;

class ListNode {
      int val;
      ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }
public class LinkedListCycle{


    // 2 solutions

    public boolean hasCycle(ListNode head) {

        HashSet<ListNode> st = new HashSet<>();
        while(head != null){
            if(st.contains(head)){
                return true;
            }
            st.add(head);
            head = head.next;
        }
        return false;
    }

    public boolean hasCycleTwoPinter(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
