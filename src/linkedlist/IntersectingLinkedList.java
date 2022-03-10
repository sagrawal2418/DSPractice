package linkedlist;

public class IntersectingLinkedList {

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

        LinkedListDemo linkedList1 = new LinkedListDemo();
        linkedList1.insertAtEnd(10);
        linkedList1.insertAtEnd(11);
        linkedList1.insertAtEnd(6);
        linkedList1.insertAtEnd(7);
        linkedList1.insertAtEnd(8);

        int point = findIntersectingPoint(linkedList, linkedList1);

        if (point != -1) {
            System.out.println("Meeting point is:: " + point);
        } else {
            System.out.println("No Meeting point:: ");

        }
    }

    private static int findIntersectingPoint(LinkedListDemo linkedList, LinkedListDemo linkedList1) {
        //result 6
        int length1 = LinkedListDemo.findLength(linkedList);
        int length2 = LinkedListDemo.findLength(linkedList1);

        int sizeDiff = Math.abs(length1 - length2);

        System.out.println(sizeDiff);
        Node ptr1 = linkedList.head;
        Node ptr2 = linkedList1.head;

        if (length1 > length2) {

            for (int i = 0; i < sizeDiff; i++) {
                ptr1 = ptr1.next;
            }

        } else {
            for (int i = 0; i < sizeDiff; i++) {
                ptr2 = ptr2.next;
            }
        }
        System.out.println(ptr1.data);


        while (ptr1.next != null) {
            if (ptr1.data == ptr2.data) {
                return ptr1.data;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return -1;

    }

   /* private static int findLengthDiff(int length1, int length2) {

        if (length1 > length2) {
            return length1 - length2;
        } else {
            return length2 - length1;
        }
    }*/


}
