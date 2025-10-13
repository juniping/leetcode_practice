import java.util.*;

class Solution {
    public int solution(int[] A) {

        int n = A.length;

        boolean isV[] = new boolean[n+1];

        for(int i: A){
            if(i<1 || i>n){
                return 0;
            }

            if(isV[i]){
                return 0;
            }

            isV[i] = true;
        }

        for(int i=1; i<n; i++){
            if(!isV[i]){
                return 0;
            }
        }
        return 1;
    }
}
