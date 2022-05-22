package greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BaekJoon2212 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();

        if (K  >= N){
            System.out.println(0);
            return;
        }

        int sum= 0;

        int[] sensorArr = new int[N];
        for (int i = 0; i < sensorArr.length; i++) {
            sensorArr[i] = in.nextInt();
        }

        Arrays.sort(sensorArr);

        Integer[] diffArr = new Integer[N-1];
        for (int i = 0; i < diffArr.length; i++) {
            diffArr[i] = sensorArr[i+1] - sensorArr[i];
        }

        Arrays.sort(diffArr, Collections.reverseOrder());

        for (int i = K-1; i < N - 1; i++) {
            sum += diffArr[i];
        }
        System.out.println(sum);
    }
}
