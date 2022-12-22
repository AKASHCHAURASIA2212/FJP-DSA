import java.io.*;
import java.util.*;

public class Main {

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void solution(String str) {
        // write your code here
        int n = str.length();
        for (int i = 0; i < n; i++) {
            String tstr = "";
            for (int j = i; j < n; j++) {
                tstr += str.charAt(j);
                if (isPalindrome(tstr)) {
                    System.out.println(tstr);
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}