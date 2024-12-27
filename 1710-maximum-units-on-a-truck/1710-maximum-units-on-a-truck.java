class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, (a,b) -> b[1]-a[1]);

        int ans = 0;
        for(int[] arr : boxTypes){
            int temp = Math.min(arr[0], truckSize);
            ans += temp*arr[1];
            truckSize-=temp;
            if(truckSize == 0){
                return ans;
            }
        }
        return ans;
    }
}

/**
하나의 트럭에 some amount of boxes를 둬야한다.

boxTypes = 2D array

boxTypes[i] = [numberOfBoxes, numberOfUnitsPerBox]

truckSize = max of boxes put

return max total units

unit큰거부터 트럭 사이즈만큼 채운다.

[
    [1,3]
    , [2,2]
    , [3,1]
]

arr.length = 3
arr[0].length = 1

 */