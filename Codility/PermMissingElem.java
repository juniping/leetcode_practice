import java.util.*;

class Solution {
    public int solution(int[] A) {

        Arrays.sort(A);

        int temp = 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != temp) {
                return temp;
            }
            temp++;
        }
        return A.length+1;
    }
}
