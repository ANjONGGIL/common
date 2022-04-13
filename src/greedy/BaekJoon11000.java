package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BaekJoon11000 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        long[][] list = new long[N][2];
        for (int i = 0; i < N; i ++){
            list[i][0] = in.nextLong();
            list[i][1] = in.nextLong();
        }

        Arrays.sort(list, Comparator.comparingLong(a -> a[1]));

        long preEndTime = 0;
        int answer = 0;
        for (int i = 0; i < N; i ++){
            if (preEndTime <= list[i][0]){
                answer++;
                preEndTime = list[i][1];
            }
        }

        System.out.println(answer);
    }
}
