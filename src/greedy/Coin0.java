package greedy;

import java.util.Scanner;

public class Coin0 {
    /*
     * 준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
     * 전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.
     * 첫째 줄에 N과 K가 주어진다.
     * (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)
     * */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();

        int[] coin = new int[N];

        for (int i = 0; i < N; i++) {
            coin[i] = in.nextInt();
        }

        int answer = 0;

        for (int i = N-1; i >= 0; i--){
            int mock = K/coin[i];
            if (mock > 0){
                answer += mock;
                K = K%coin[i];
            }
        }

        System.out.println(answer);
    }
}
