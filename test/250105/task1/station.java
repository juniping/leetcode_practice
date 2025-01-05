class Solution {
    public int solution(int[] start, int[] dest, int[] limit) {
        int max = 0; // largest station number;
        int result = 0;

        for(int i=0; i<start.length; i++){
            result += (Math.abs(start[i]-dest[i]))*2 + 1;
            max = Math.max(max, start[i]);
            max = Math.max(max, dest[i]);
        }
        if(limit[max] > result){
            return result;
        }else{
            return limit[max];
        }
    }
}

/*
k개의 스테이션이 있고 0~k-1 번 으로 구분된다.

스테이션 번호 1차이가 나면 바로 직행으로 연결이 가능하다.
매시간 탑승객들은 두개의 인접한 역들을 비용 +2를 통해 이동이 가능하다.
최종 금액은 당일 승객의 탑승 기록을 기반으로 측정된다.

하루에 총 요금의 제한 금액이 있다.
제한 금액을 넘어도 추가로 금액이 지불되지 않는다.
제한은 승객이 당일 방문한 역의 번호 중 가장 큰 번호를 가진 역에 따라 결정된다.

N 길이의 start, dest 배열을 받고
X번째 탑승이라면 start[x] -> dest[x]로 이동한다.
제한을 담은 k길이의 limit 배열도 받는다.
당일 탑승객이 간 가장 큰 번호의 역이 Y라면 그 승객의 당일 제한은 limit[Y]다.

반환값은 해당 승객의 당일 비용이 된다. (int)



*/
