class Solution {
    public int removeElement(int[] nums, int val) {
        /*
        nums 배열 중 val과 같지 않은 숫자만 count한다.
         */
         int k=0;

         for (int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
         }
         return k;
    }
}