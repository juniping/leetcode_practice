class Solution {
    public double findMaxAverage(int[] nums, int k) {


        double sum = 0;
        int len = nums.length;
        
        for(int i=0; i<k; i++){
            sum += nums[i];
        }

        double max = sum;

        for(int i=k; i<len; i++){
            sum = sum - nums[i-k] + nums[i];
            max = Math.max(sum, max);
        }

        return max/k;
    }
}
