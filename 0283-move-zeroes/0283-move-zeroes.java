class Solution {
    public void moveZeroes(int[] nums) {

        int result[] = new int[nums.length];

        for(int i: result){
            i = 0;
        }

        int resultIndex = 0;

        for(int i : nums){
            if(i!=0){
                result[resultIndex] = i;
                resultIndex++;
            }
        }

        for(int i=0; i<nums.length; i++){
            nums[i] = result[i];
        }
        
    }
}