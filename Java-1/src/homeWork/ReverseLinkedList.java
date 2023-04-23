package homeWork;

public class ReverseLinkedList {
    public static void main(String[] args) {
//        [1,2,3,4,5]
        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        ListNode head5 = new ListNode(5);
        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        ListNode listNode = reverseList(head);
        System.out.println("first: " + listNode.val + " second: " + listNode.next.val + " third: " + listNode.next.next.val +" forth: " + listNode.next.next.next.val + " fifth: " + listNode.next.next.next.next.val);
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode previous = null;
        ListNode current = head;
        ListNode next = current.next;

        while (current != null) {
            current.next = previous;
            previous = current;
            current =  next;

            if (next != null){
                next = next.next;
            }
        }
        return  previous;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
