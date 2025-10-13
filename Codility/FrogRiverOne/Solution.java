import java.util.*;

class Solution {
    public int solution(int X, int[] A) {
        
        int length = A.length;
        boolean isFalled[] = new boolean[X+1];
        int cnt = X;

        for(int i=0; i<length; i++){
            if(!isFalled[A[i]]){
                isFalled[A[i]] = true;
                cnt--;
            }
            if(cnt==0){
                return i;
            }
        }
        return -1;
    }
}
