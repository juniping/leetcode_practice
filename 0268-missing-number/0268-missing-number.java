class Solution {
    public int missingNumber(int[] nums) {
        int N = nums.length;
        int result = 0;
        boolean visited[] = new boolean[N+1];
        
        for(int i: nums){
            visited[i] = true;
        }

        for(int i=1; i<N+1; i++){
            if(!visited[i]){
                result = i;
            }
        }

        return result;

    }
}
