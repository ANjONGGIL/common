package greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//백준 2217번
public class Rope {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();

        Integer[] ropes = new Integer[k];
        for (int i = 0; i < k; i++) {
            ropes[i] = in.nextInt();
        }

        Arrays.sort(ropes, Collections.reverseOrder());

        int max = 0;
        for (int i = k - 1; i >= 0; i--) {
            if (max < ropes[i] * k) {
                max = ropes[i] * k;
            }

            k -= 1;
        }

        System.out.println(max);
    }
}
