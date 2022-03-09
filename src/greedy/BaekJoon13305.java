package greedy;

import java.util.Scanner;

public class BaekJoon13305 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        long[] city = new long[N];
        long[] distance = new long[N - 1];

        for (int i = 0; i < distance.length; i++) {
            distance[i] = in.nextLong();
        }

        for (int i = 0; i < city.length; i++) {
            city[i] = in.nextLong();
        }

        long min = 1000000000;
        long answer = 0;
        for (int i = 0; i < N - 1; i++) {
            if (city[i] <= min) {
                min = city[i];
            }

            answer += distance[i] * min;
        }

        System.out.println(answer);

    }
}
