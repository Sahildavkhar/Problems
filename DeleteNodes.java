import java.util.HashSet;
import java.util.Set;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class DeleteNodes {

    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> valuesToRemove = new HashSet<>();
        for (int num : nums) {
            valuesToRemove.add(num);
        }

        while (head != null && valuesToRemove.contains(head.val)) {
            head = head.next;
        }

        if (head == null) {
            return null;
        }

        ListNode current = head;
        while (current.next != null) {
            if (valuesToRemove.contains(current.next.val)) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        // Example usage:
        DeleteNodes solution = new DeleteNodes();
        int[] nums = {2, 3};
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode modifiedHead = solution.modifiedList(nums, head);
        while (modifiedHead != null) {
            System.out.print(modifiedHead.val + " ");
            modifiedHead = modifiedHead.next;
        }
    }
}

