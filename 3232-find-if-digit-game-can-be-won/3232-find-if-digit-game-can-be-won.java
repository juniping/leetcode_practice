class Solution {
    public boolean canAliceWin(int[] nums) {
        
        // 모든 1의자리 수를 가지거나 , 모든 2의 자리 수를 가진다.
        int sum =0, singleSum=0, doubleSum = 0;

        for(int i=0; i<nums.length; i++){
            // 그냥 다 더하는 놈
            sum += nums[i];

            // 1의자리 수만 더하는 놈
            if((nums[i]/10) > 0){
                singleSum += nums[i];
            }else{
                // 2의자리 수만 더하는 놈
                doubleSum += nums[i];
            }
        }

        if(singleSum > (sum - singleSum)){
            return true;
        }else if (doubleSum > (sum - doubleSum)){
            return true;
        }else{
            return false;
        }

    }
}