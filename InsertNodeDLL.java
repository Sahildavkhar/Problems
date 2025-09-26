// Time Complexity: O(n) for insertion at tail
// Space Complexity: O(n) where n is the number of nodes in the doubly linked list

public class InsertNodeDLL {
    public static class Node {
        public int data;
        public Node next;
        public Node back;

        public Node(int data1, Node next1, Node back1) {
            data = data1;
            next = next1;
            back = back1;
        }

        public Node(int data1) {
            data = data1;
            next = null;
            back = null;
        }
    }

    private static Node NodeDLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    private static Node insertAtTail(Node head, int val){
        Node newNode = new Node(val);
        if(head == null){
            return newNode;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.back = temp;
        
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = NodeDLL(arr);
        System.out.print("Doubly Linked List: ");
        print(head);

        System.out.print("After inserting at tail: ");
        head = insertAtTail(head, 20);
        print(head);
    }
}
