import java.util.*;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        
        int N = A.length;
        for(int i=0; i<N-2; i++){
            if((long)A[i]+(long)A[i+1]>A[i+2]){
                return 1;
            }
        }
        return 0;
    }
}
