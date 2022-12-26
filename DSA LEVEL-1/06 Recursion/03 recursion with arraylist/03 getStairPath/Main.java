import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n) {
        ArrayList<String> ans = new ArrayList<String>();
        myStairPath(n, "", ans);
        return ans;
    }

    public static void myStairPath(int n, String psf, ArrayList<String> li) {
        if (n == 0) {
            li.add(psf);
            return;
        }

        if (n - 1 >= 0) {
            myStairPath(n - 1, psf + "1", li);
        }

        if (n - 2 >= 0) {
            myStairPath(n - 2, psf + "2", li);
        }

        if (n - 3 >= 0) {
            myStairPath(n - 3, psf + "3", li);
        }

    }

}