package linkedlist;

/*
Given a singly linked list, find the middle of the linked list. For example, if the given linked list is 1->2->3->4->5
 then the output should be 3. If there are even nodes, then there would be two middle nodes, we need to print the
 second middle element. For example, if given linked list is 1->2->3->4->5->6 then the output should be 4.
 */
public class MiddleOfLinkedList {

    public static void main(String[] args) {

        LinkedListDemo linkedListDemo = new LinkedListDemo();
        linkedListDemo.insertAtEnd(1);
        linkedListDemo.insertAtEnd(2);
        linkedListDemo.insertAtEnd(3);
        linkedListDemo.insertAtEnd(4);
        linkedListDemo.insertAtEnd(5);
        linkedListDemo.insertAtEnd(6);

        linkedListDemo.print(linkedListDemo);
        printMid(linkedListDemo);

    }

    public static void printMid(LinkedListDemo linkedListDemo) {

        //1,2,3,4
        //1,3,5,
        Node slow_ptr = linkedListDemo.head;
        Node fast_ptr = linkedListDemo.head;

        while (fast_ptr.next != null) {

            slow_ptr = slow_ptr.next;
            if (fast_ptr.next.next == null) break;
            fast_ptr = fast_ptr.next.next;
        }
        /*
         while (fast_ptr.next != null && fast_ptr!=null) {
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
        }
         */

        System.out.println(slow_ptr.data);
    }
}
