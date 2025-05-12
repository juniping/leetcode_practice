import java.util.*;

class Solution {
    public int solution(int[] A) {
        
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i : A){
            currentSum = Math.max(i, currentSum + i);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
