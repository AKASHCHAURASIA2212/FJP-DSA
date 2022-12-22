import java.io.*;
import java.util.*;

public class Main {

    public static String toggleCase(String str) {
        // write your code here
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            if (ch >= 97 && ch <= 122) {
                // char x = ch-32;
                sb.setCharAt(i, (char) (ch - 32));
            } else {
                sb.setCharAt(i, (char) (ch + 32));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }

}