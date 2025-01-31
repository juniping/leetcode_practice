class Solution {
    public boolean isBoomerang(int[][] points) {
        int cnt=0;
        int carr[][] = new int[101][101];
        for (int i=0; i<3; i++){
            carr[points[i][0]][points[i][1]]=1;
            if(points[i][0] == points[i][1]){
                cnt++;
            }
        }

        int ncnt =0;
        for(int i=0; i<101; i++){
            for (int j=0; j<101; j++){ 
                ncnt += carr[i][j];
            }
        }

        if(ncnt < 3) return false;

        if(cnt<3){
            return true;
        }else{
            return false;
        }
    }
}
//같은 점이 두번 나올 수 있음
