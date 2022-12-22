import java.io.*;
import java.util.*;

public class Main {

    public static boolean isPrime(int val) {
        for (int i = 2; i * i <= val; i++) {
            if (val % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void solution(ArrayList<Integer> al) {
        // write your code here
        int count = 0;
        int i = 0;
        while (i != al.size()) {
            int temp = al.get(i);
            if (isPrime(temp)) {
                al.remove(i);
                // System.out.println("al->"+al);
                i = 0;
            } else {
                i++;
            }
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(scn.nextInt());
        }
        solution(al);
        System.out.println(al);
    }

}