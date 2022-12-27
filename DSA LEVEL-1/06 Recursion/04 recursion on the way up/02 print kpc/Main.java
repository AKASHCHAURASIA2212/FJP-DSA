import java.io.*;
import java.util.*;

public class Main {

    static String[] code = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printKPC(str, "");
    }

    public static void printKPC(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        int idx = ch - '0';
        String codes = code[idx];
        for (int i = 0; i < codes.length(); i++) {
            printKPC(str.substring(1), ans + codes.charAt(i));
        }

    }

}