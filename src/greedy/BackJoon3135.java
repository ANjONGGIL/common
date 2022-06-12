package greedy;

import java.io.*;
import java.util.StringTokenizer;

public class BackJoon3135 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Integer A = Integer.parseInt(st.nextToken());
        Integer B = Integer.parseInt(st.nextToken());
        Integer N = Integer.parseInt(st.nextToken());

        int min = 0;
        min = Math.abs(A - B);

        for (int i = 0; i < N; i++) {
            int favorite = Integer.parseInt(st.nextToken());
            min = Math.min(Math.abs(B-favorite)+1,min);
        }

        System.out.println(min);
    }
}
