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


    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        for(int i=1; i <= n+1; i++){
            fast = fast.next;
        }

        while(fast !=null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;


    }
}
