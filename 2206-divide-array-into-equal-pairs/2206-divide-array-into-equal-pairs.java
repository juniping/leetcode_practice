class Solution {
    public boolean divideArray(int[] nums) {

        Arrays.sort(nums);
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                stack.push(nums[i]);
            }else{
                int peek = stack.pop();
                if(peek==nums[i]){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}