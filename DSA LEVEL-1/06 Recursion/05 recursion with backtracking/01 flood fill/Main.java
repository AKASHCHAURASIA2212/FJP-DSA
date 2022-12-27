import java.io.*;
import java.util.*;

public class Main {
    static boolean[][] vis;
    static int[][] dir = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };
    static char[] dname = { 't', 'l', 'd', 'r' };

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        vis = new boolean[n][m];
        floodfill(arr, 0, 0, "");
    }

    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf) {
        if (sr >= maze.length || sc >= maze[1].length || sr < 0 || sc < 0) {
            return;
        }
        if (sr == maze.length - 1 && sc == maze[0].length - 1) {
            System.out.println(asf);
            return;
        }

        // four moves top,left,down,right (tldr)
        for (int i = 0; i < dir.length; i++) {
            int nr = dir[i][0];
            int nc = dir[i][1];
            if (sr + nr < maze.length && sc + nc < maze[1].length && sr + nr >= 0 && sc + nc >= 0
                    && maze[sr + nr][sc + nc] == 0 && vis[sr + nr][sc + nc] == false) {
                vis[sr][sc] = true;
                floodfill(maze, sr + nr, sc + nc, asf + dname[i]);
                vis[sr][sc] = false;
            }
        }

    }
}
