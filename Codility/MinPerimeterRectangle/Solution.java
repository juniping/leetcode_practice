class Solution {
    public int solution(int N) {

        int min = Integer.MAX_VALUE;

        for(int i=1; (long)i*i<=N; i++){
            if(N%i==0){
                int j = N/i;
                min = Math.min(min, 2*(i+j));
            }
        }
        return min;
    }
}
