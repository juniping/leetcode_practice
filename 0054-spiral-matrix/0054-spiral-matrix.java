class Solution {

    public static int row=0;
    public static int col=0;

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        row = matrix.length;
        col = matrix[0].length;

        boolean isVisited[][] = new boolean[row][col];

        visit(0,0,isVisited, list, matrix, 0);
        return list;
    }

    private void visit(int i, int j, boolean[][] isVisited, List<Integer> list, int[][] matrix, int d){

        list.add(matrix[i][j]);
        isVisited[i][j] = true;

        int dx[] = {0,1,0,-1};
        int dy[] = {1,0,-1,0};

        int newdX = i + dx[d];
        int newdY = j + dy[d];

        if(newdX>=0 && newdX<row && newdY>=0 && newdY<col && !isVisited[newdX][newdY]){
            visit(newdX, newdY, isVisited, list, matrix, d);
        }

        for(int dd=0; dd<4; dd++){
            int newX = i + dx[dd];
            int newY = j + dy[dd];

            if(newX>=0 && newX<row && newY>=0 && newY<col && !isVisited[newX][newY]){
                visit(newX, newY, isVisited, list, matrix,dd);
            }
        }
    }
}