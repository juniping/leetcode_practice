import java.util.*;

class Solution {
    public int solution(int[] A) {
        
        int currentSum = 0;
        int maxSum = 0;

        for(int i : A){
            currentSum = Math.max(i, currentSum + i);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
