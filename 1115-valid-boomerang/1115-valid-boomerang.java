class Solution {
    public boolean isBoomerang(int[][] p) {
        return ((p[1][0]-p[0][0])*(p[2][1]-p[1][1]) != (p[1][1]-p[0][1])*(p[2][0]-p[1][0]));
    }
}
//같은 점이 두번 나올 수 있음
