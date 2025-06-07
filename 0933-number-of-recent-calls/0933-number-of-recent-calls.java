class RecentCounter {

    private Queue<Integer> queue;

    // 특정 time frame에 들어온 최근 요청의 수를 카운트 
    public RecentCounter() {
        // recent requests를 0으로 초기화
        queue = new LinkedList<>();
        
    }
    
    public int ping(int t) {
        // time t에 들어온 새로운 요청을 추가
        queue.offer(t);

        // t는 milliseconds의 시간을 표현
        // return : 지난 3000 milli초 동안 이뤄진 요청의 개수 (t-3000, t)
        while(queue.peek() < t-3000){
            queue.poll();
        }

        return queue.size();
    }
    //ping을 하는 모든 call은 원칙적으로 이전 call 보다 큰 t를 사용한다.
}
