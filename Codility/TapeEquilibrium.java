import java.util.*;

class Solution {
    public int solution(int[] A) {

        int sum = 0;
        for(int num:  A){
            sum+=num;
        }

        int min = Integer.MAX_VALUE;
        int result = 0;

        for(int i=0; i<A.length-1; i++){
            result += A[i];
            int gap = Math.abs(sum-result-result);
            min = Math.min(gap, min);
        }

        return min;
    }
}
