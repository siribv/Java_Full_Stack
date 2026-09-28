public class linkedlist {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    // Insert at head
    public void insertHead(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } 
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Display
    public void display() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        linkedlist list = new linkedlist();

        list.insertHead(10);
        list.insertHead(20);
        list.insertHead(30);

        list.display();
    }
}