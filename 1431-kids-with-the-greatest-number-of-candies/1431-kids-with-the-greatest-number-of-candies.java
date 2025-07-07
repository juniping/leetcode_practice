class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        Boolean result[] = new Boolean[candies.length];

        int max = 0;

        for(int i: candies){
            max = Math.max(i, max);
        }

        for(int i=0; i<candies.length; i++){
            if(candies[i]+extraCandies < max){
                result[i] = false;
            }else{
                result[i] = true;
            }
        }

        List<Boolean> list = new ArrayList<>();

        for(Boolean b: result){
            list.add(b);
        }

        return list;
    }
}