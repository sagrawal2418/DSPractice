package linkedlist;

public class SplitListToParts {

    public static void main(String[] args) {

        int k = 5;
        LinkedListDemo linkedListDemo = new LinkedListDemo();
        linkedListDemo.insertAtEnd(1);
        linkedListDemo.insertAtEnd(2);
        linkedListDemo.insertAtEnd(3);

        int lengthOfLinkedList = LinkedListDemo.findLength(linkedListDemo);
        int q = lengthOfLinkedList % k;

        System.out.println(q);

    }
}
