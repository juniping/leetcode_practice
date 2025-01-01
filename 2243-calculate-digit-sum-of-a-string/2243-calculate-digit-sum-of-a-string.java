class Solution {
    public String digitSum(String s, int k) {

        while(s.length() > k){

            String r = "";
            for (int i=0; i<s.length(); i+=k){
                String temp = s.substring(i, Math.min(i+k, s.length()));
                int sum = 0;
                for(int j=0; j<temp.length(); j++){
                    sum += temp.charAt(j) - '0';
                }
                r += sum;
            }
            s = r;

        }
        return s;

    }
}


/**
1. 문자열을 주어진 k 길이로 자르고 
2. 각 자른 문자열의 합을 모아 새로운 문자열을 만든다
3. 문자열의 길이가 <= K가 되면 리턴

s를 링크드리스트에 넣고 s를 비운다. 앞에서부터 0부터 k까지 꺼내서 더한다. -> 스트링 s에 넣는다.
만약 스트링 길이가 k이하면 출력 아니면 다시

 */