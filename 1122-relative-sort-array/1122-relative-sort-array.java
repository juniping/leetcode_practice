class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i: arr1){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }

        int result[] = new int[arr1.length];
        int repeat = 0;

        for(int i: arr2){
            int cnt = map.get(i); // 숫자 i가 존재하는 개수
            map.put(i, map.get(i)-1);
            for(int j=0; j<cnt; j++){
                result[repeat++] = i;
            }
            map.remove(i);
        }

        List<Integer> remains = new ArrayList<>(map.keySet());

        Collections.sort(remains);

        for(int i: remains){
            int cnt = map.get(i); //i의 개수
            for(int j=0; j<cnt; j++){
                result[repeat++] = i;
            }
        }

        return result;
    }
}