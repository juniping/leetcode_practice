class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] judge = new int[n+1];
        for(int i=1; i<trust.length+1; i++){
            judge[trust[i-1][0]]--;
            judge[trust[i-1][1]]++; 
        }
        for(int j=1;j<judge.length; j++){
            if(judge[j] == n-1){
                return j;
            }
        }
        return -1;
    }
}