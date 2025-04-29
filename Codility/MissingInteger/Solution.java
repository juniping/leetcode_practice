class Solution {
    public int solution(int[] A) {
        
        int N = A.length;

        boolean marker[] = new boolean[N+2];

        for(int i: A){
            if(i>0 && i<= N+1){
                marker[i] = true;
            }
        }

        for(int i=1; i<N+2; i++){
            if(!marker[i]){
                return i;
            }
        }
        return N+1;
    }
}
