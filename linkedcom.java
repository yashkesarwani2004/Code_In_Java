public class linkedcom {

    public static class Node {
        int data;
        Node next;
    }

    public static void main(String args[]) {
        Node head1 = new Node();
        head1.data = 1;
        Node node2 = new Node();
        node2.data = 2;
        head1.next = node2;
        Node node3 = new Node();
        node3.data = 3;
        node2.next = node3;
        Node node4 = new Node();
        node4.data = 4;
        node3.next = node4;

        Node head2 = new Node();
        head2.data = 1;
        Node n1 = new Node();
        n1.data = 5;
        head2.next = n1;
        Node n2 = new Node();
        n2.data = 6;
        n1.next = n2;
        Node n3 = new Node();
        n3.data = 7;
        n2.next = n3;
        n3.next = null;

        Node l1 = head1;
        Node l2 = head2;
        Node res = new Node();
        Node p = res;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        if (l1 == null) {
            p.next = l2;
        }

        else if (l2 == null) {
            p.next = l1;
        }
                display(res);


    }

    public static void display(Node res) {
        Node curr = res;
        while (curr != null) {
            System.out.print(curr.data);
            curr = curr.next;
        }
    }
}
