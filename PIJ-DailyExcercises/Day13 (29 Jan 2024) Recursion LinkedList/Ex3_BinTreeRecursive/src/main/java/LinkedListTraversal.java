public class LinkedListTraversal {
    // Recursive method for traversing the linked list
    public static void traverseLinkedList(BinTreeRec node) {
        if (node != null) {
            // Print the value of the current node
            System.out.print(node.value + " ");

            // Move to the next node recursively
            traverseLinkedList(node.next);
        }
    }

    public static void main(String[] args) {
        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        BinTreeRec head = new BinTreeRec(1);
        head.next = new BinTreeRec(2);
        head.next.next = new BinTreeRec(3);
        head.next.next.next = new BinTreeRec(4);
        head.next.next.next.next = new BinTreeRec(5);

        // Traverse the linked list recursively
        System.out.println("Linked List traversal:");
        traverseLinkedList(head);
    }
}
