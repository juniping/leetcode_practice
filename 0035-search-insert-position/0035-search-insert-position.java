class Solution {
    public int searchInsert(int[] nums, int target) {

        if(nums[0]>target){
            return 0;
        }

        int c = 0;
        int result = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<target){
                c = i;
            }
            if(nums[i]==target){
                return i;
            }
        }
        return c+1;
    }
}