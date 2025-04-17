// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        
        String binary = Integer.toBinaryString(N);

        int max = Integer.MIN_VALUE;
        int cnt = 0;

        for(char c : binary.toCharArray()){

            if(c == '1'){
                if(max < cnt){
                    max = cnt;
                }
                cnt = 0;
            }else{
                cnt++;
            }
        }

        return max;
    }
}
