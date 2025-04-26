class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int N = nums.length;
        boolean temp[] = new boolean[N+1];

        for(int i: nums){
            temp[i] = true;
        }

        List<Integer> result = new ArrayList<>();

        for(int i=1; i<N+1; i++){
            if(!temp[i]){
                result.add(i);
            }
        }

        return result;

    }
}