class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        // arr1이랑 같은 크기의 배열을 만든다.

        // arr2를 돌고 arr1에서 그 값을 찾아.
        // map에 다가 찾으면 key, 1 하고 이미 있었으면 2개

        // arr2를 하나씩 돌면서 arr2의 값과 같은 것을 찾아서 있는경우에 arr1에 넣는다 (value만큼 반복해서)
        // 이때 인덱스가 하나 있어야겠고.

        // arr1은 arr2에 포함되지 않는 수도 존재한다.

        Arrays.sort(arr1);

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