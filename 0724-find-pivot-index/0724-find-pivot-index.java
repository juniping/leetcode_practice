class Solution {
    public int pivotIndex(int[] nums) {
        int[] leftArr = new int[nums.length];
        int[] rightArr = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            int sumLeft = 0;
            for (int j=i; j>=0; j--){
                sumLeft += nums[j];
            }
            leftArr[i] = sumLeft;
            sumLeft = 0;

            int sumRight = 0;
            for (int j=i; j<nums.length; j++){
                sumRight += nums[j];
            }
            rightArr[i] = sumRight;
            sumRight = 0;
            
            if(leftArr[i]==rightArr[i]){
                return i;
            }
        }
        return -1;
    }
}