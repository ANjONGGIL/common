package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon10610 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String N = in.next();

        if (!N.contains("0")){
            System.out.println(-1);
            return;
        }

        int sum = 0;

        Integer[] arr = new Integer[N.length()];
        for (int i = 0; i < N.length(); i++){
            sum += Integer.parseInt(String.valueOf(N.charAt(i)));
            arr[i] = Integer.valueOf(String.valueOf(N.charAt(i)));
        }

        if (sum%3 != 0){
            System.out.println(-1);
            return;
        }

        Arrays.sort(arr);

        String answer = "";
        for (int j = arr.length-1; j >= 0;j--){
            answer += String.valueOf(arr[j]);
        }

        System.out.println(answer);
    }
}
