class DummyNode {
    int data;
    DummyNode next;

    public DummyNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DummyLinkedList {
    public static void main(String[] args) {
        DummyNode head = new DummyNode(1); // Dummy linked list node
        head.next = new DummyNode(2);
        
        // Print dummy linked list data
        DummyNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
