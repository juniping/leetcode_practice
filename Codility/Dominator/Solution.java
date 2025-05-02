import java.util.*;

class Solution {
    public int solution(int[] A) {
        
        Map<Integer, Integer> map = new HashMap<>();

        int N = A.length;

        for(int i=0; i<N; i++){
            int candidate = A[i];
            // if i contains in A
            if(map.containsKey(candidate)){
                map.put(candidate, map.get(candidate)+1);
            }else{
                map.put(candidate, 1);
            }

            if(map.get(candidate)>A.length/2){
                return i;
            }
        }
        return -1;
    }
}
