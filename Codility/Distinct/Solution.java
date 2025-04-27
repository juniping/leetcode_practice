class Solution {
    public int solution(int[] A) {
        HashSet<Integer> arr = new HashSet<>();

        for(int i : A){
            arr.add(i);
        }

        return arr.size();
    }
}
