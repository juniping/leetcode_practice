class Solution {
    public int solution(int N) {
        int cnt = 0;
        for(int i=1; i*i<=N; i++){
            if((N%i)==0){
                if(i*i==N){
                    cnt++;
                }else{
                    cnt+=2;
                }
            }
        }
        return cnt;
    }
}
