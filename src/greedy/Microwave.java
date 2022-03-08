package greedy;

import java.util.Scanner;

public class Microwave {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int runningTime = in.nextInt();

        int[] reservationTime = {600, 60, 10};

        int answer[] = {0,0,0};
        for (int i = 0; i < reservationTime.length; i++) {
            if (runningTime / reservationTime[i] > 0) {
                answer[i] += runningTime / reservationTime[i];
                runningTime = runningTime % reservationTime[i];
            }
        }

        if (runningTime != 0) {
            System.out.println(-1);
            return;
        }

        for (int j = 0; j < answer.length; j++) {
            System.out.println(answer[j]);
        }

    }
}
