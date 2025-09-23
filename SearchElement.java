// Java program to search an element in linked list
// Time Complexity: O(n)
// Space Complexity: O(1)

class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class SearchElement {
    public static int SearchElement(Node head, int val){
        Node temp = head;

        while(temp != null){
            if(temp.data == val){
                return 1;
            }
            else{
                temp = temp.next;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int val = 3;

        if(SearchElement(head, val) == 1){
            System.out.print("Element Found");
        }
        else{
            System.out.print("Element Not Found");
        }
    }
    
}
