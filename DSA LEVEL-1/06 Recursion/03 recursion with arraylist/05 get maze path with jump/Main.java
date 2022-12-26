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

        ArrayList<String> myAns = new ArrayList<>();

        for (int jump = 1; jump <= Math.max(dr, dc); jump++) {

            // horizontal move with jump
            ArrayList<String> rans1 = getMazePaths(sr, sc + jump, dr, dc);
            for (String str : rans1) {
                myAns.add("h" + jump + str);
            }

            // vertical move with jump
            ArrayList<String> rans2 = getMazePaths(sr + jump, sc, dr, dc);
            for (String str : rans2) {
                myAns.add("v" + jump + str);
            }

            // daigonal move with jump
            ArrayList<String> rans3 = getMazePaths(sr + jump, sc + jump, dr, dc);
            for (String str : rans3) {
                myAns.add("d" + jump + str);
            }

        }

        return myAns;

    }

}
