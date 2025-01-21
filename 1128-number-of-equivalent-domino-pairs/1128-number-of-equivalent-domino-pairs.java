class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {

        int arr[][] = new int[10][10];
        int result = 0;
        for(int i=0; i<dominoes.length; i++){
            if(dominoes[i][0] < dominoes[i][1]){
                int temp = dominoes[i][0];
                dominoes[i][0] = dominoes[i][1];
                dominoes[i][1] = temp;
            }

            result += arr[dominoes[i][0]][dominoes[i][1]];
            arr[dominoes[i][0]][dominoes[i][1]]++;

        }
        return result;
    }
}


