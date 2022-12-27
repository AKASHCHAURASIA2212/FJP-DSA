import java.io.*;
import java.util.*;

public class Main {

    static char[] encode = { ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
            'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printEncodings(str);
    }

    public static void printEncodings(String str) {
        Encoding(str, "");
    }

    public static void Encoding(String str, String asf) {
        if (str.length() == 0) {
            System.out.println(asf);
            return;
        }

        char ch = str.charAt(0);
        if (ch != '0') {
            Encoding(str.substring(1), asf + encode[ch - '0']);
        } else {
            return;
        }
        String check = str;
        if (str.length() > 2) {
            check = str.substring(0, 2);
        }

        int num = Integer.parseInt(check);
        // System.out.println(num);
        if (num <= 26 && str.length() > 2) {
            Encoding(str.substring(2), asf + encode[num]);
        } else if (str.length() == 2 && num <= 26) {
            Encoding("", asf + encode[num]);
        }

    }

}