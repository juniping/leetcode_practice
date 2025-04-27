import java.util.*;

class Solution {
    public int solution(int[] A) {
        
        Arrays.sort(A);

        int N = A.length;

        return Math.max((A[N-1]*A[N-2]*A[N-3])
        , (A[0]*A[1]*A[N-1]));
    }
}
