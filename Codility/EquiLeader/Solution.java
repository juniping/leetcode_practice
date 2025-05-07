import java.util.*;

class Solution {
    public int solution(int[] A) {
        Map<Integer, Integer> maps = new HashMap<>();

        // 등장 횟수 저장
        for(int i : A){
            if(maps.containsKey(i)){
                maps.put(i, maps.get(i)+1);
            }else{
                maps.put(i, 1);
            }
        }

        int offset = A.length/2; //leader가 되는 개수

        int leader = -1; // 리더
        int leaderCnt = 0; // 리더의 개수

        // 리더를 찾는다.
        for(Map.Entry<Integer, Integer> entry : maps.entrySet()){
            if(entry.getValue() > offset){
                leader = entry.getKey();
                leaderCnt = entry.getValue();
            }
        }

        if(leader == -1 ) return 0;

        //A 배열을 돌면서 왼쪽과 오른쪽의 리더의 개수가 같을 때 cnt를 추가한다.

        int leftCnt = 0;
        int equiCnt = 0;
        for(int i=0; i<A.length; i++){

            // left에 있는 leader의 개수는 누적된다.
            if(A[i] == leader){
                leftCnt++;
            }

            int leftSize = i+1;
            int rightSize = A.length-leftSize;
            int rightCnt = leaderCnt - leftCnt;

            // 양쪽에서 leader가 leader가 되면 equiCnt를 ++
            if(leftCnt > leftSize/2 && rightCnt > rightSize/2){
                equiCnt++;
            }
        }

        return equiCnt;
    }
}
