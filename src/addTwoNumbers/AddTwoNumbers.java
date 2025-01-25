package addTwoNumbers;

public class AddTwoNumbers {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode();
        ListNode cur = dummyNode;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int total = carry;
            if (l1 != null) {
                total += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                total += l2.val;
                l2 = l2.next;
            }
            int num = total % 10;
            carry = total / 10;
            dummyNode.next = new ListNode(num);
            dummyNode = dummyNode.next;
        }
        return cur.next;
    }

    public static void main(String[] args) {
        AddTwoNumbers solution = new AddTwoNumbers();

        // Test Case 1:
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = solution.addTwoNumbers(l1, l2);
        System.out.println("Test Case 1:");
        System.out.print("Output: ");
        printList(result);

        // Test Case 2:
        l1 = new ListNode(0);
        l2 = new ListNode(0);
        result = solution.addTwoNumbers(l1, l2);
        System.out.println("\nTest Case 2:");
        System.out.print("Output: ");
        printList(result);

        // Test Case 3:
        l1 = new ListNode(9);
        ListNode current = l1;
        for (int i = 0; i < 6; i++) {
            current.next = new ListNode(9);
            current = current.next;
        }

        l2 = new ListNode(9);
        current = l2;
        for (int i = 0; i < 3; i++) {
            current.next = new ListNode(9);
            current = current.next;
        }

        result = solution.addTwoNumbers(l1, l2);
        System.out.println("\nTest Case 3:");
        System.out.print("Output: ");
        printList(result);
    }

    private static void printList(ListNode node) {
        System.out.print("[");
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) System.out.print(",");
            node = node.next;
        }
        System.out.println("]");
    }
}