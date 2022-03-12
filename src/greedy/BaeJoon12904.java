package greedy;

import java.util.Scanner;

public class BaeJoon12904 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String S  = in.next();
        String T = in.next();

        StringBuilder sbS = new StringBuilder(S);
        StringBuilder sbT = new StringBuilder(T);

        while (sbS.length() < sbT.length()){
            sbT.deleteCharAt(sbT.length()-1);
            if (sbT.charAt(sbT.length()-1) == 'B'){
                sbT.reverse();
            }
        }

        S = sbS.toString();
        T = sbT.toString();
        System.out.println(S.equals(T)?1:0);
    }
}
