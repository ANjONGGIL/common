package greedy;

import java.util.Scanner;

public class BaekJoon2864 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String A = in.next();
        String B = in.next();

        int maxA = Integer.valueOf(A.replace('5','6'));
        int maxB = Integer.valueOf(B.replace('5','6'));

        int minA = Integer.valueOf(A.replace('6','5'));
        int minB = Integer.valueOf(B.replace('6','5'));

        System.out.println(minA+minB);
        System.out.println(maxA+maxB);
    }
}
