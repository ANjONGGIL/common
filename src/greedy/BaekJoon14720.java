package greedy;

import java.util.Scanner;

public class BaekJoon14720 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] arr = new int[N];
        for (int i = 0;i < N;i++){
            arr[i] = in.nextInt();
        }

        int count = 0;
        int next = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == next && next == 0) {
                count++;
                next = 1;
                continue;
            }
            if (arr[i] == next && next == 1) {
                count++;
                next = 2;
                continue;
            }
            if (arr[i] == next && next == 2) {
                count++;
                next = 0;
                continue;
            }

        }

        System.out.println(count);
    }
}
