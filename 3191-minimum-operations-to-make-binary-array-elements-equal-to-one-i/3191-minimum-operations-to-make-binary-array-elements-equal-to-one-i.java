class Solution {
    public int minOperations(int[] nums) {
        int l = nums.length;
        int result = 0;

        for(int i=0; i<l-2; i++){
            if(nums[i]==0){
                result++;
                nums[i] = 1;
                nums[i+1] = 1-nums[i+1];
                nums[i+2] = 1-nums[i+2];
            }
        }

        if(nums[l-1]==0 || nums[l-2]==0){
            return -1;
        }
        return result;
    }
}