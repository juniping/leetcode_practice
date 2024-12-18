class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        List<String> val = new ArrayList<>();
        int minIndexSum = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }

        for (int j = 0; j < list2.length; j++) {
            map2.put(list2[j], j);

            if (map1.containsKey(list2[j])) {
                int currentIndexSum = j + map1.get(list2[j]);

                if (currentIndexSum < minIndexSum) {
                    minIndexSum = currentIndexSum;
                    val.clear();
                    val.add(list2[j]);
                } else if (currentIndexSum == minIndexSum) {
                    val.add(list2[j]);
                }
            }
        }

        return val.toArray(new String[0]);
    }
}

/***
주어진 두 문자열 배열 list1, list2, 공통 문자열을 최소한의 인덱스 합으로 찾아라.

공통 문자열은 두 배열에 모두 등장한다.

list1[i]와 list2[j]에서 공통 문자열이 등장했다면, i+j가 최소값이다.

최솟값의 인덱스 합을 갖는 공통 문자열을 모두 반환하라. 순서는 무관.
 */