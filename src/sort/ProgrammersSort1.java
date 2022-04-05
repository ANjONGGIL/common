package sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProgrammersSort1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2,5,3},{4, 4, 1},{1, 7, 3}};
        int[] answer = solution.solution(array,commands);

        for (int i = 0; answer.length  > i ;i++){
            System.out.println(answer[i]);
        }
    }
}

class Solution{
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++){
            List<Integer> tmp = new ArrayList<>();
            //tmp에 array[commands[i][0] - 1] ~ array[commands[i][1]] 집어넣기
            for (int j = commands[i][0] - 1; j < commands[i][1] ; j++) {
                tmp.add(array[j]);
            }

            tmp.sort(Comparator.naturalOrder());

            answer[i] = tmp.get(commands[i][2]-1);
        }
        return answer;
    }
}
