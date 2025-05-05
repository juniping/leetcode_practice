import java.util.Stack;

class Solution {
    public int solution(int[] A, int[] B) {
        Stack<Integer> downstream = new Stack<>();
        int alive = 0;

        for (int i = 0; i < A.length; i++) {
            int size = A[i];
            int dir = B[i];

            if (dir == 1) {
                downstream.push(size);
            } else {
                boolean isAlive = true;
                while (!downstream.isEmpty()) {
                    if (downstream.peek() > size) {
                        isAlive = false;
                        break;
                    } else {
                        downstream.pop();
                    }
                }

                if (isAlive) {
                    alive++;
                }
            }
        }

        return alive + downstream.size();
    }
}
