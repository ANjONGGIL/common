package greedy;

import java.util.Scanner;

public class Change {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pay = in.nextInt();

        int change = 1000 - pay;

        int[] coin = {500,100,50,10,5,1};

        int answer = 0;
        for (int i = 0; i < coin.length; i++){
            if (change/coin[i] >= 1){
                answer += change/coin[i];
                change = change%coin[i];
            }
        }

        System.out.println(answer);
    }

}
