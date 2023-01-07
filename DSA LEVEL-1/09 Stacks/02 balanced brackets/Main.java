import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();
        boolean ans = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                if (ch == ')') {
                    if (st.size() > 0 && st.peek() == '(') {
                        st.pop();
                    } else {
                        ans = false;
                        break;
                    }

                } else if (ch == ']') {
                    if (st.size() > 0 && st.peek() == '[') {
                        st.pop();
                    } else {
                        ans = false;
                        break;
                    }

                } else if (st.size() > 0 && ch == '}') {
                    if (st.peek() == '{') {
                        st.pop();
                    } else {
                        ans = false;
                        break;
                    }

                }
            }
        }

        if (st.size() != 0) {
            ans = false;
        }
        System.out.println(ans);

    }

}