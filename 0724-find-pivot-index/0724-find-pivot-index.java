class Solution {
    public int pivotIndex(int[] nums) {
        
        int l = nums.length;

        int totalSum = 0;

        for(int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for(int i=0; i<l; i++){
            int rightSum = totalSum-leftSum-nums[i];

            if(leftSum==rightSum){
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}
