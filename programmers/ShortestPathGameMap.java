import java.util.*;

class Solution {
    static int N, M;
    
    public int solution(int[][] maps) {
        N = maps.length;
        M = maps[0].length;
        
        return bfs(maps);
    }
    
    public int bfs(int[][] maps) {
        // 이동 방향 (상, 하, 좌, 우)
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        // 방문 여부와 최단 거리 저장 배열
        boolean[][] visited = new boolean[N][M];
        
        // BFS를 위한 큐 (x, y, 이동 거리)
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1}); // 시작 위치 (0,0), 거리 = 1
        visited[0][0] = true;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int distance = current[2];
            
            // 목적지 도착 시 최단 거리 반환
            if (x == N - 1 && y == M - 1) {
                return distance;
            }
            
            // 네 방향 탐색
            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];
                
                // 이동 가능한 경우 탐색
                if (newX >= 0 && newX < N && newY >= 0 && newY < M && maps[newX][newY] == 1 && !visited[newX][newY]) {
                    queue.offer(new int[]{newX, newY, distance + 1});
                    visited[newX][newY] = true; // 방문 처리
                }
            }
        }
        
        // 목표 지점에 도달할 수 없는 경우
        return -1;
    }
}
