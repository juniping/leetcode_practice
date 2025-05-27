class Solution {
    public int searchInsert(int[] nums, int target) {

        int properIndex = 0;

        for(int i=0; i<nums.length; i++){
            properIndex = i;

            if(nums[i]==target){
                return i;
            }

            if(target < nums[i]){
                break;
            }
        }        
        if(target > nums[properIndex]){
            return properIndex+1;
        }
        return properIndex;
    }
}
