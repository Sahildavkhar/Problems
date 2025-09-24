public class DeleteNodeDLL {
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

    private static Node DeleteTail(Node head, int val){
        if( head == null || head.next == null){
            return null;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node newTail = temp.back;
        newTail.next = null;
        temp.back = null;

        return head;
    }

    private static Node DeleteHead(Node head, int val){
        if(head == null || head.next == null){
            return null;
        }

        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;

        return head;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        Node head = NodeDLL(arr);
        System.out.print("Doubly Linked List: ");
        print(head);

        head = DeleteHead(head, 0);
        System.out.print("After Deleting Head: ");
        print(head);      
    }
}


