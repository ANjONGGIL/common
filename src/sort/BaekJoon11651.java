package sort;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon11651 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[][] list = new int[N][2];
        for (int i = 0; i < N; i++){
            list[i][0] = in.nextInt();
            list[i][1] = in.nextInt();
        }


        Arrays.sort(list, (e1, e2) -> {
            if(e1[1] == e2[1]) {
                return e1[0] - e2[0];
            } else {
                return e1[1] - e2[1];
            }
        });

        for(int i = 0; i < N; i++) {
            System.out.println(list[i][0] + " " + list[i][1]);
        }
    }
}
