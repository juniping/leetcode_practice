class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int N = flowerbed.length;

        int newBed[] = new int[N+2];

        for(int i=0; i<N; i++){
            newBed[i+1] = flowerbed[i];
        }

        for(int i=1; i<N+1; i++ ){
            if(newBed[i]==0 && newBed[i-1]==0 && newBed[i+1]==0){
                newBed[i] = 1;
                n--;
            }
        }

        if(n>0){
            return false;
        }
        return true;
    }
}