class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> map1 = new HashMap<>(); //Map<원소, 배열번호>
        Map<Integer, Integer> map2 = new HashMap<>(); //Map<원소, 배열번호>

        for(int i: nums1){
            map1.put(i, 1);
        }

        for(int i: nums2){
            map2.put(i, 2);
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int i: nums1){
            if(!map2.containsKey(i) && !list1.contains(i)){
                list1.add(i);
            }
        }

        for(int i: nums2){
            if(!map1.containsKey(i) && !list2.contains(i)){
                list2.add(i);
            }
        }

        List<List<Integer>> llist = new ArrayList<>();

        llist.add(list1);
        llist.add(list2);
        
        return llist;


    }
}