class Solution {
    public int orangesRotting(int[][] grid) {
        boolean isV[][] = new boolean[grid.length][grid[0].length];
        Queue<int []> queue = new LinkedList<>();
        int fresh =0;

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 2){ //rotten spot
                    queue.add(new int[]{i,j});
                }else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }

        return bfs(queue, grid, isV, fresh);

    }

    public int bfs(Queue<int[]> queue, int [][]grid, boolean [][]isV , int fresh){
        int result = 0;
        int dx[] = {-1, 0, 1, 0};
        int dy[] = {0, 1, 0, -1};

        while(!queue.isEmpty()){
            int size = queue.size();
            boolean isRotten = false;

            for(int k=0; k<size; k++){
                int cur[] = queue.poll();
                int x = cur[0];
                int y = cur[1];
                isV[x][y] = true;
                for(int i=0; i<4; i++){
                    int newX = dx[i]+x;
                    int newY = dy[i]+y;
                    if(newX>=0 && newX<grid.length && newY>=0 && newY<grid[0].length && !isV[newX][newY] && grid[newX][newY]==1){
                        queue.add(new int[]{newX, newY});
                        isV[newX][newY] = true;
                        isRotten = true;
                        fresh--;
                    }
                }
            }
            
            if(isRotten) result++;
        }

        if(fresh>0){
            return -1;
        }else{
            return result;
        }
    }
}