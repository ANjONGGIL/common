package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon1744 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] list = new int[N];
        long answer = 0;

        for (int i = 0; i < N; i++) {
            list[i] = in.nextInt();
        }

        Arrays.sort(list);
        int left = 0;
        int right = N - 1;
        answer = 0;
        // 0, 음수일 경우 처리
        for (; left < right; left += 2) {
            if (list[left] < 1 && list[left + 1] < 1) {
                answer += list[left] * list[left + 1];
            } else {
                break;
            }
        }

        // 양수일 경우 처리
        for (; right > 0; right -= 2) {
            // 1과는 곱하지 않게 조건문 추가.
            if (list[right] > 1 && list[right - 1] > 1) {
                answer += list[right] * list[right - 1];
            } else {
                break;
            }
        }
        //남은 값들은 더해주기
        for (; right >= left; right--) {
            answer += list[right];
        }
        System.out.println(answer);

    }
}
