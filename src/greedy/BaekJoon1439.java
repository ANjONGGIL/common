package greedy;

import java.util.Scanner;

public class BaekJoon1439 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String S = in.next();

        int zeroCount = 0;
        int oneCount = 0;
        char checker = 0;
        for (int i = 0; i < S.length();i++){
            if (i == 0){
                if (S.charAt(i) == '0'){
                    oneCount++;
                }else{
                    zeroCount++;
                }
                checker = S.charAt(i);
            }

            if (checker != S.charAt(i)){
                if (S.charAt(i) == '0'){
                    oneCount++;
                }else{
                    zeroCount++;
                }
                checker = S.charAt(i);
            }
        }

        System.out.println(zeroCount < oneCount?zeroCount:oneCount);

    }
}
