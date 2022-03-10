package linkedlist;

public class DetectAndBreakTheLoop {

    public static void main(String[] args) {

        LinkedListDemo linkedList = new LinkedListDemo();
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(5);
        linkedList.insertAtEnd(6);
        linkedList.insertAtEnd(7);
        linkedList.insertAtEnd(8);

        linkedList.head.next.next.next.next.next.next.next.next = linkedList.head.next.next.next;


        // variable to detect length of loop
        int k = 1;
        Node ptr1 = null;
        Node ptr2 = null;
        Node meetingPoint = isALoop(linkedList);
        if (meetingPoint != null) {
            ptr1 = meetingPoint;
            ptr2 = meetingPoint;
        }

        while (ptr1 != null && ptr1.next != null && ptr1.next != ptr2) {
            ptr1 = ptr1.next;
            k++;
        }

        ptr1 = linkedList.head;
        ptr2 = linkedList.head;

        for (int i = 0; i < k; i++) {
            ptr2 = ptr2.next;
        }

        while (ptr1.next != ptr2.next) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        ptr2.next = null;

        linkedList.print(linkedList);
        //  System.out.println(linkedList.head.next.next.next.next.next.next.next.data);

    }

    private static Node isALoop(LinkedListDemo linkedList) {
        Node fast = linkedList.head;
        Node slow = linkedList.head;
        Node meetingPoint = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                meetingPoint = fast;
                break;
            }
        }
        return meetingPoint;
    }

}
