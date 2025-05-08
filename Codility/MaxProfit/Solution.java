import java.util.*;

class Solution {
    public int solution(int[] A) {
        int maxEnding = 0;
        int maxSlice = 0;

        for(int i=1; i<A.length; i++){
            maxEnding = Math.max(0, maxEnding + A[i]-A[i-1]);
            maxSlice = Math.max(maxEnding, maxSlice);
        }
        return maxSlice;
    }
}
