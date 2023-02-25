import java.lang.management.ThreadInfo;

import javax.tools.Diagnostic;

public class main {

    public static class Node {
        int val;
        Node next;
    }

    public static class CLL {
        static Node head = null;
        static Node tail = null;
        static int size = 0;

        public static void addLast(int val) {
            if (head == null) {
                Node node = new Node();
                node.val = val;
                head = node;
                tail = node;
            } else {
                Node node = new Node();
                node.val = val;
                tail.next = node;
                tail = node;
            }
            size++;
        }

        public static void addFirst(int val) {
            if (head == null) {
                Node node = new Node();
                node.val = val;
                head = node;
                tail = node;

            } else {
                Node node = new Node();
                node.val = val;
                node.next = head;
                head = node;
            }

            size++;

        }

        public static void addAt(int idx, int val) {
            // 1 base indexing
            if (idx == size + 1) {
                addLast(val);
            } else if (idx == 1) {
                addFirst(val);
            } else if (idx > size || idx < 1) {
                System.out.println("invalid index !!!!");
                return;
            } else {

                Node node = new Node();
                node.val = val;
                Node curr = head, prev = null;

                for (int i = 1; i < idx; i++) {
                    prev = curr;
                    curr = curr.next;
                }

                node.next = curr;
                prev.next = node;
                size++;

            }

        }

        public static int removeLast() {

            if (head == null) {
                System.out.println("List is Empty !!!!!!!");
                return -1;
            }
            if (head.next == null) {
                int val = head.val;
                head = null;
                tail = null;
                size = 0;
                return val;
            } else {
                Node curr = head, prev = null;

                while (curr.next != null) {
                    prev = curr;
                    curr = curr.next;
                }

                int val = curr.val;

                prev.next = null;
                tail = prev;
                size--;

                return val;
            }

        }

        public static int removeFirst() {

            if (head == null) {
                System.out.println("List is Empty !!!!!!!");
                return -1;
            }
            if (head.next == null) {
                int val = head.val;
                head = null;
                tail = null;
                size = 0;
                return val;
            } else {
                int val = head.val;
                head = head.next;
                size--;
                return val;
            }

        }

        public static int removeAt(int idx) {
            // 1 base indexing
            if (idx == size) {
                return removeLast();
            } else if (idx == 1) {
                return removeFirst();
            } else if (idx > size || idx < 1) {
                System.out.println("invalid index !!!!");
                return -1;
            } else {
                Node curr = head, prev = null;

                for (int i = 1; i < idx; i++) {
                    prev = curr;
                    curr = curr.next;
                }

                int val = curr.val;

                prev.next = prev.next.next;
                size--;

                return val;

            }

        }

        public static void size() {
            System.out.println("Size : " + size);
        }

        public static void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " --> ");
                temp = temp.next;
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        System.out.println("Custom linked list");
        CLL list = new CLL();
        System.out.println("==========ADD LAST==============");
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(50);
        list.display();
        System.out.println("==========ADD FIRST==============");
        list.addFirst(1);
        list.display();

        System.out.println("==========ADD AT==============");
        list.addAt(6, 60);
        list.display();
        list.size();
        list.addAt(7, 100);
        list.display();
        list.size();

        System.out.println("==========REMOVE LAST==============");
        int val = list.removeLast();
        System.out.println("deleted val : " + val);
        list.display();
        val = list.removeLast();
        System.out.println("deleted val : " + val);
        list.display();

        System.out.println("==========REMOVE FIRST==============");
        list.removeFirst();
        list.display();
        list.size();

        System.out.println("==========REMOVE AT==============");
        list.removeAt(2);
        list.display();
        list.size();

    }
}
