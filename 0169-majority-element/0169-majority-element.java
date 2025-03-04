class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int max = 0;

        for(int num: nums){
            if(num > max) max = num;
        }

        int check[] = new int[max+1];

        for(int num: nums){
            check[num]++;
        }

        for(int i=0; i<check.length; i++){
            if(check[i]> (n/2)){
                return i;
            }
        }
        return 0;
        
    }
}