// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {

        int currenti = 0;   // 현재까지의 1의 개수
        int totalSumi = 0;  // 전체 1의 개수
        int result=0;   //최종 답

        // 전체 1의 개수 합 구하기
        for(int i: A){
            if(i==1){
                totalSumi++;
            }
        }


        for(int i: A){
            if(i==1){
                currenti++;
            }else{
                result += totalSumi-currenti;
                if(result > 1000000000){
                    return -1;
                }
            }
        }

        return result;
    }
}
