class Solution {
    public int[] solution(int[] A, int K) {

        int size = A.length;
        if(size==0){
            return A;
        }
        int temp[] = new int[size]; // 새로운 rotation 결과

        // K번 반복
        for(int i=0; i<K%size; i++){

            // rotation
            temp[0] = A[size-1]; //A의 맨 마지막 값이 temp의 첫번째 값이 된다.

            // n번재 값은 n+1에 배치한다.(0번째 값은 1번째 값이 된다.)
            for(int j=0; j<size-1; j++){
                temp[j+1] = A[j];
            }

            // 변경된 배열 내용을 다시 A에 반영.
            for(int j=0; j<size; j++){
                A[j] = temp[j];
            }
        }
        return A;
    }
}
