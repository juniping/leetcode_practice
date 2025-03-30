import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static char[][] maps;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        maps = new char[N][M];
        for(int i = 0; i < N; i++) {
            maps[i] = br.readLine().toCharArray();
        }

        int result = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(maps[i][j] == 'L') {
                    result = Math.max(result, bfs(i, j));
                }
            }
        }

        System.out.println(result);

    }

    public static boolean goingDecision(int nx, int ny, int[][] visited) {
        if(0 <= nx && nx < N && 0 <= ny && ny < M && maps[nx][ny] == 'L' && visited[nx][ny] == 0) {
            return true;
        }
        return false;
    }

    public static int bfs(int i, int j) {

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
    
        // 방문 처리
        int[][] visited = new int[N][M];
        visited[i][j] = 1;

        int count = 0;

        // 큐가 빌때까지 진행
        while(!queue.isEmpty()) {

            int[] here = queue.poll();
            int x = here[0];
            int y = here[1];

            // 상하좌우 탐색
            for(int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];

                if(goingDecision(nx, ny, visited)) {
                    visited[nx][ny] = visited[x][y] + 1;
                    count = Math.max(count, visited[nx][ny]);
                    queue.add(new int[]{nx, ny});
                }
            }
        }
        return count - 1;
    }
}
