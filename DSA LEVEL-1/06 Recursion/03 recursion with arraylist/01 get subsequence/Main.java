import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> al = gss(str);
        System.out.println(al);
    }

    public static ArrayList<String> gss(String str) {
        if (str.length() == 0) {
            ArrayList<String> li = new ArrayList<String>();
            li.add("");
            return li;
        }

        char ch = str.charAt(0);
        String substr = str.substring(1);
        ArrayList<String> rans = gss(substr);

        ArrayList<String> myans = new ArrayList<>();

        for (String x : rans) {
            myans.add(x);
        }

        for (String x : rans) {
            myans.add(ch + x);
        }

        return myans;
    }

}