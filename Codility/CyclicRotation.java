class Solution {
    public int[] solution(int[] A, int K) {
        
        int N = A.length;
        int result[]= new int[N];

        for(int i=0; i<N; i++){
            result[(i+K)%N] = A[i];
        }

        return result;
    }
}
