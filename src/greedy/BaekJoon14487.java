package greedy;

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon14487 {
    public static void main(String[] args) throws IOException {
        int islandCnt;
        int[] moveCostArr;
        int maxCost = 0;
        int result = 0;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        islandCnt = Integer.parseInt(bf.readLine());

        moveCostArr = new int[islandCnt];

        StringTokenizer st = new StringTokenizer(bf.readLine());

        for(int i = 0; i < islandCnt; i++) {
            moveCostArr[i] = Integer.parseInt(st.nextToken());
            result += moveCostArr[i];

            if(maxCost == 0) {
                maxCost = moveCostArr[i];
            } else if(maxCost < moveCostArr[i]) {
                maxCost = moveCostArr[i];
            }
        }
        result -= maxCost;
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
