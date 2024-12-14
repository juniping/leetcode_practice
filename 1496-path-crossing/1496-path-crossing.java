class Solution {
    public boolean isPathCrossing(String path) {

        int l = path.length();

        int x=0; int y=0;

        for(int i=0; i<l; i++){
            String temp = path.subString(i);
            if(temp = 'N'){
                y++;
            }else if(temp = 'W'){
                x--;
            }else if(temp = 'E')
        }
        
    }
}



/**
1. 스트링을 무슨 타입으로 받아야할까
2. N일때, E일때, S, W일때 각각 포인트가 어떻게 달라지는지 (IF문으로 분개처리)
3. 
 */