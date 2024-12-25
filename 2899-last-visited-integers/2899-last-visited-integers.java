class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {

        ArrayList<Integer> seen = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int k=0;

        for(int i=0; i<nums.length; i++){
            if (nums[i]<0){
                k++;

                if(seen.size() >= k){
                    ans.add(seen.get(k-1));
                }else{
                    ans.add(-1);
                }
            }else{
                seen.add(0, nums[i]);
                k=0;
            }
        }

        return ans;
    }
}


/**

seen = queue of met positive nums

number of appearence -1 = K

ans = queue of seen[index] when met meet append K

 */