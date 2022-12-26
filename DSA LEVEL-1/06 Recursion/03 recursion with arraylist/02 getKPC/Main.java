import java.io.*;
import java.util.*;

public class Main {

    static String[] code = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> al = getKPC(str);
        System.out.println(al);
    }

    public static ArrayList<String> getKPC(String str) {
        if (str.length() == 0) {
            ArrayList<String> li = new ArrayList<String>();
            li.add("");
            return li;
        }

        char ch = str.charAt(0);
        String substr = str.substring(1);
        ArrayList<String> rans = getKPC(substr);

        ArrayList<String> myans = new ArrayList<>();

        int idx = ch - '0';
        String codes = code[idx];

        for (int i = 0; i < codes.length(); i++) {
            char var = codes.charAt(i);
            for (String x : rans) {
                myans.add(var + x);
            }
        }

        return myans;
    }

}