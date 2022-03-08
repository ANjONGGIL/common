package greedy;

import java.util.Scanner;

public class BaekJoon1789 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long N = in.nextLong();

        int i = 0;

        while (N > i) {
            i++;
            N = N - i;
        }

        System.out.println(i);
    }
}
