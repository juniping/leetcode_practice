class Solution {
    public int findDuplicate(int[] nums) {

        int n = nums.length;
        boolean isV[] = new boolean[n+1];
        int result = 0;

        isV[0] = true;

        for(int i: nums){
            if(isV[i]){
                result = i;
            }else{
                isV[i] = true;
            }
        }
        return result;
    }
}