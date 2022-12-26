import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(getMazePaths(0, 0, n - 1, m - 1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr > dr || sc > dc) {
            return new ArrayList<>();
        }
        if (sr == dr && sc == dc) {
            ArrayList<String> bans = new ArrayList<>();
            bans.add("");
            return bans;
        }

        ArrayList<String> rans1 = getMazePaths(sr, sc + 1, dr, dc);
        ArrayList<String> rans2 = getMazePaths(sr + 1, sc, dr, dc);

        ArrayList<String> myAns = new ArrayList<>();
        for (String str : rans1) {
            myAns.add("h" + str);
        }

        for (String str : rans2) {
            myAns.add("v" + str);
        }

        return myAns;

    }

}
