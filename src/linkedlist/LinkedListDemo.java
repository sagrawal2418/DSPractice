package linkedlist;

//
public class LinkedListDemo {

    public Node head;

    public static void main(String[] args) {

    }

    public void insertAtEnd(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void insertAtBeginning(int data) {

        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void print(LinkedListDemo linkedListDemo) {

        Node currentNode = linkedListDemo.head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    static int findLength(LinkedListDemo linkedList) {

        int size = 1;
        Node currNode = linkedList.head;
        while (currNode.next != null) {
            size++;
            currNode = currNode.next;
        }

        return size;
    }
}
