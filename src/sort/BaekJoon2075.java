package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            st= new StringTokenizer(br.readLine());
            for (int j = 0; j < arr.length; j++) {
                arr[idx++] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(arr);

        System.out.println(arr[n*n]-n);
    }
}
