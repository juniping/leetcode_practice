import java.util.*;

class Solution {
    public int[] solution(int[] A) {
        int len = A.length;
        int[] result = new int[len];

        int max = 2 * len;
        int[] count = new int[max + 1];

        for (int num : A) {
            count[num]++;
        }

        for (int i = 0; i < len; i++) {
            int N = A[i];
            int divisorCount = 0;

            for (int j = 1; j * j <= N; j++) {
                if (N % j == 0) {
                    divisorCount += count[j];

                    int paired = N / j;
                    if (j != paired) {
                        divisorCount += count[paired];
                    }
                }
            }

            result[i] = len - divisorCount;
        }

        return result;
    }
}
