
class Solution {
    public int solution(int N, int M) {
        return N/gcd(N,M);
    }

    private int gcd(int N, int M){
            while(M != 0){
                int temp = N%M;
                N = M;
                M = temp;
            }
            return N;
        }
}
