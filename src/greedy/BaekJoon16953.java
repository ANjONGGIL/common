package greedy;

import java.util.Scanner;

public class BaekJoon16953 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        int answer = 1;

        while (B >= A) {
            if (B == A) {
                break;
            }

            answer++;

            if (B % 2 == 0) {
                B = B / 2;
            } else if (B % 10 == 1) {
                B = (B - 1) / 10;
            } else {
                break;
            }
        }

        if (B != A){
            answer = -1;
        }

        System.out.println(answer);
    }
}
