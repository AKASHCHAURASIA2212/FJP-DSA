import java.util.ArrayList;
import java.util.Stack;

public class main {
    public static class Node {
        int val;
        ArrayList<Node> list = new ArrayList<>();
    }

    public static void display(Node root) {
        System.out.print("root:" + root.val + " child: ");

        ArrayList<Node> children = root.list;
        for (int i = 0; i < children.size(); i++) {
            int val = children.get(i).val;
            System.out.print(" " + val);
        }
        System.out.println();

        for (int i = 0; i < children.size(); i++) {
            display(children.get(i));
        }

    }

    public static void main(String[] args) {
        int[] gtarr = { 1, 2, 5, -1, -1, 3, 6, -1, 7, -1, -1, 4, 8, -1, 9, -1, 10, -1, -1, -1 };

        Stack<Node> st = new Stack<>();
        Node root = null;

        int idx = 0;
        while (idx < gtarr.length) {
            int val = gtarr[idx];
            if (val == -1) {
                st.pop();
            } else {
                Node node = new Node();
                node.val = gtarr[idx];
                if (st.size() > 0) {
                    Node rem = st.peek();
                    rem.list.add(node);
                } else {
                    root = node;
                }
                st.push(node);
            }
            idx++;

        }

        display(root);
    }
}
