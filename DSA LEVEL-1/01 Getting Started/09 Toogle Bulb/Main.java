import java.util.*;

public class Main {
    public static void toogleBulb(int num) {

        for (int i = 1; i * i <= num; i++) {
            System.out.println(i * i);

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        toogleBulb(num);

    }
}