package math;

import java.util.Scanner;

public class BaekJoon15596 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] a = new int[N];

        long answer = 0;
        for (int i : a){
            answer += i;
        }

        System.out.println(answer);
    }
}
