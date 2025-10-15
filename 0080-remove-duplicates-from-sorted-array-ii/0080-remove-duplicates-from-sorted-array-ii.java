class Solution {
    public int removeDuplicates(int[] nums) {

        int insertPos = 0; //insert 위치
        int cnt =0; // 실제 숫자 개수
        
        for(int i: nums){
            if(insertPos<2 || nums[insertPos-2]!=i){
                nums[insertPos] = i;
                insertPos++;
                cnt++;
            }
        }
        return cnt;
    }
}