import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {

        int arrLength = array.length;
        int comLength = commands.length;
        int[] answer = new int[comLength];

        List<Integer> list;
        for(int i=0; i<comLength; i++){
            list  = new ArrayList<>();
            for(int j=commands[i][0]-1; j<commands[i][1]; j++){
                list.add(array[j]);
            }
            System.out.println(list.toString());
            // 정렬 후 K 번째 답을 answer[i]에 추가
            Collections.sort(list);
            answer[i] = list.get(commands[i][2]-1);
        }
        return answer;
    }
}
