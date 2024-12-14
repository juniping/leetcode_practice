class Solution {
    public boolean isPathCrossing(String path) {

        int x=0, y=0;

        // 방문경로를 저장한다.
        Set<String> visited = new HashSet<>();
        visited.add("0,0"); // 초기 위치
        
        for(char direction : path.toCharArray()){
            if(direction == 'N'){
                y++;
            }else if(direction == 'W'){
                x--;
            }else if(direction == 'E'){
                x++;
            }else if(direction == 'S'){
                y--;
            }

            // 현재 위치 추가 
            String currentPosition = x + "," + y;
            
            // 지금 위치를 온적이 있다면 true 반환.
            if(visited.contains(currentPosition)){
                return true;
            }

            // 온적 없다면 추가
            visited.add(currentPosition);
        }
        return false;
    }
}
